docker build -t spring-boot-helloworld:1.0 .

kubectl create secret generic ocir-secret \
--from-file=.dockerconfigjson=$HOME/.docker/config.json \
--type=kubernetes.io/dockerconfigjson
