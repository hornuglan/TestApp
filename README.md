# Тестовое приложение в виде клиент-банка. 

## Общая информация
Приложение представляет собой Single activity с двумя фрагментами - 
 - первый фрагмент (MainFragment) представляет собой экран с информацией: о карте (номер и тип карты, имя пользователя, баланс в долларах и в выбранной пользователем валюте), кнопки для выбора валюты (GBP, EUR, RUB), список последних транзакций с указанием компании и суммы в долларах и в выбранной валюте
- второй фрагмент (CardsFragment) представляет собой список карт для выбора

В первом фрагменте можно выбрать валюту из предложенных и нажать на нее - в этом случае баланс на изображении карты и в списке транзакций автоматически пересчитается по текущему курсу

По нажатию на изображение карты открывается второй фрагмент со списком карт, где выбранная карта будет помечена точкой. По нажатию на номер любой карты открывается первый фрагмент с данными выбранной карты.

Приложение построено в соответствии с принципами MVVM.  Навигация между фрагментами осуществляется с помощью  navGraph.

## Установка и запуск
Для запуска требуется Android Studio с поддержкой Kotlin

## Замечания

- Запрос на скачивание курсов валют и запрос для получения информации о пользователе происходят в момент запуска приложения, дальше никакие сетевые запросы не осуществляются. Поэтому в проекте не используются корутины, так как сетевое взаимодействие расположено только в одном месте.

- Для рассчета курса и валютных операций используется Double, вместо Decimal или подключения внешней библиотеки. Для небольшого упрощения.

