#!/bin/bash

./gradlew bootJar

for server in '13.124.6.161'; do
	rsync -azcv '--chown=ec2-user:ec2-user' '--exclude=log/**' --exclude='.git' --rsync-path='sudo rsync' ./build/libs/dogcatproject-app-0.0.1-SNAPSHOT.jar $server:~/dogcat/
	ssh $server 'cd dogcat;kill -9 `cat run.pid`'
#	ssh $server 'cd dm;nohup java -jar -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=9872 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false -Djava.rmi.server.hostname=3.38.214.221 -Dspring.profiles.active=production -Duser.timezone=Asia/Seoul DeviceManager-0.0.1-SNAPSHOT.war > /dev/null 2>&1 & echo $! > run.pid'
	ssh $server 'cd dogcat;nohup java -jar -Dspring.profiles.active=production -Duser.timezone=Asia/Seoul dogcatproject-app-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 & echo $! > run.pid'
done
