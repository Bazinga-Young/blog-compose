# add user
useradd mysql
# set password
passwd mysql

# pull mysql image
docker search mysql

docker pull mysql:8.0.11

# setting
mkdir /home/mysql/log /home/mysql/data /home/mysql/conf /home/mysql/mysql-files
chmod -R 700 /home/mysql
mkdir /home

#start
docker run -p 3306:3306 --name mysql --privileged=true \
-v /home/mysql/log:/var/log/mysql \
-v /home/mysql/data:/var/lib/mysql \
-v /home/mysql/conf:/etc/mysql/conf.d \
-v /etc/localtime:/etc/localtime:ro \
-v /home/mysql/mysql-files:/var/lib/mysql-files \
-e MYSQL_ROOT_PASSWORD=3er4#ER$ \
-d mysql:8.0.11

# show logs
docker logs mysql

docker ps -a

# enter container
docker exec -it mysql /bin/bash
#
mysql -u root -p

exit


