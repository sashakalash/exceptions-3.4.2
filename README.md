 Валидация прочитанных событий
Описание
Для выполнения задачи со звездочкой мы напишем программу проверки коррекности прочитанных значений. Для этого подготовим список событий - такими событиями (event) могут быть фильмы/спектакли.

Базовый класс event содержит поля: название (title), год выпуска (releaseYear), ограничение по возрасту (age).

Если любое из полей прочитанного объекта равно null или 0 (для целочисленных полей), нужно выбсроить RuntimeException и завершить работу программы, если ошибок не возникло - вывести сообщение "Все события корректны".


Функционал программы
Создание заранее подготовленного списока событий - отдельно для кино и отдельно для театров;
Возможность валидации каждолго из списка событий с помощью универсального метода;
Если хотя бы одно из событий содержит поля со значением null или 0, завершить работу программы и вывести это событие;
Если ошибок не возникло, вывести сообщение "Все события корректны".