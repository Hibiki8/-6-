# Street Fighter 6 Stats Web

## Overview
This project is a dedicated website for Street Fighter 6, providing users with various statistics, character information, rankings, and gameplay metrics. The site is designed to be user-friendly and visually appealing, utilizing modern web technologies.

## Project Structure
```
sf6-stats-web
├── css
│   ├── style.css        # Main styles for the website
│   └── reset.css        # CSS reset for consistent styling across browsers
├── js
│   ├── main.js          # Main JavaScript file for functionality
│   └── data.js          # Data-related functions and variables
├── pages
│   ├── index.html       # Main landing page
│   ├── characters.html   # Character profiles and abilities
│   ├── rankings.html     # Player and character rankings
│   └── statistics.html    # Detailed gameplay statistics
├── components
│   ├── header.html      # Header structure with navigation
│   ├── footer.html      # Footer structure with copyright and links
│   └── character-card.html # Individual character card structure
├── fonts                # Custom font files
├── README.md            # Project documentation
└── index.html           # Main entry point for the website
```

## Features
- **Character Information**: Detailed profiles for each character, including abilities and statistics.
- **Rankings**: Up-to-date rankings for players and characters based on performance.
- **Statistics**: Comprehensive gameplay statistics to analyze character performance and trends.
- **Responsive Design**: The website is designed to be fully responsive, ensuring a great user experience on all devices.

## Setup Instructions
1. Clone the repository to your local machine.
2. Open the `index.html` file in your web browser to view the website.
3. Customize styles in the `css/style.css` file as needed.
4. Modify JavaScript functionality in the `js/main.js` file.

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue for any suggestions or improvements.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.
# Street Fighter 6 Stats Web

## 起動方法

クローンしたプロジェクトのルートで Spring Boot を起動します。Java 21 が必要です。Maven は Maven Wrapper が取得・実行するため、別途インストールする必要はありません。

```sh
./mvnw spring-boot:run
```

`http://localhost:8080/` を開いてください。ルート直下と `sf6-stats-web/` 以下の既存ページ、CSS、JavaScript、コンポーネントは Spring Boot から配信されます。トップページは `GET /api/health` で API 接続を確認します。

テストを実行するには次のコマンドを使います。

```sh
./mvnw test
```

## Spring Boot API

- `GET /api/health` — API の稼働状態を JSON (`{"status":"UP"}`) で返します。