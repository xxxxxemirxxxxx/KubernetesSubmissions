
1. Deploy with: kubectl apply -f k8s/deployment.yaml
2. Get your pod name with: kubectl get pods
2. Implement port forwarding with: kubectl port-forward "your_pod_name" 3000:3333
3. To confirm it's working, type in browser: localhost:3000/status