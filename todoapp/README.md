
1. Deploy with: kubectl create deployment todoapp --image=swipped/todoapp
2. Expose required ports: kubectl expose deployment todoapp --port=80 --target-port=3333 --type=LoadBalancer
3. Check status with: kubectl describe deployment todoapp