1. Create cluser with port mapping: k3d cluster create --port 8082:30333@agent:0 -p 8081:80@loadbalancer --agents 2
2. Deploy with: kubectl apply -f k8s/deployment.yaml
3. Implement service (port mapping) with: kubectl apply -f k8s/service.yaml