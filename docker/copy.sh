#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20210908.sql ./mysql/db
cp ../sql/ry_config_20220114.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../ga-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy ga-gateway "
cp ../ga-gateway/target/ga-gateway.jar ./ga/gateway/jar

echo "begin copy ga-auth "
cp ../ga-auth/target/ga-auth.jar ./ga/auth/jar

echo "begin copy ga-visual "
cp ../ga-visual/ga-monitor/target/ga-visual-monitor.jar  ./ga/visual/monitor/jar

echo "begin copy ga-modules-system "
cp ../ga-modules/ga-system/target/ga-modules-system.jar ./ga/modules/system/jar

echo "begin copy ga-modules-file "
cp ../ga-modules/ga-file/target/ga-modules-file.jar ./ga/modules/file/jar

echo "begin copy ga-modules-job "
cp ../ga-modules/ga-job/target/ga-modules-job.jar ./ga/modules/job/jar

echo "begin copy ga-modules-gen "
cp ../ga-modules/ga-gen/target/ga-modules-gen.jar ./ga/modules/gen/jar

