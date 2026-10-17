const backendStatus = document.querySelector("#backend-status");

if (backendStatus) {
    fetch("/api/health")
        .then((response) => {
            if (!response.ok) {
                throw new Error(`Health check failed: ${response.status}`);
            }
            return response.json();
        })
        .then((health) => {
            backendStatus.textContent = health.status === "UP"
                ? "Spring Boot API: 接続済み"
                : "Spring Boot API: 稼働していません";
        })
        .catch(() => {
            backendStatus.textContent = "Spring Boot APIに接続できません。アプリケーションを起動してください。";
        });
}