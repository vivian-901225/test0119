function transitionToBluePage() {
            // 先防止頁面跳轉
            event.preventDefault();

            // 漸變頁面透明度
            document.body.style.transition = 'opacity 2s';
            document.body.style.opacity = '0';

            // 延遲跳轉到新頁面
            setTimeout(function() {
                window.location.href = 'pageTwo.html';
            }, 2000); // 2秒後跳轉