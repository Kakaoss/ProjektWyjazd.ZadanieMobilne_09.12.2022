<strong><em> ŚRODOWISKO </strong></em>
- Android Studio

<b>DZIAŁANIE PROGRAMU:</b>

- Wybieranie daty wyjazdu oraz powrotu, za pomocą przycisków
- Po wybraniu daty wyjazu oraz powrotu, oblicza ilość dni wyjazdu
- Blokowanie wyjazdu "przeszłego"
- Blokowanie możlwosci wyjazdu do 2 lat w przód

<strong><em> 1. NIEZAWODNOŚĆ </strong></em>

- Brak żadnych dodatkowych działań po uruchomieniu
- Brak dodatkowych okien w aplikacji(jest tylko 1 główne)
- Brak dodatkowych funkcji podtrzymywujących dane przy wyłączeniu aplkacji ( Zostawiamy Systemowe )
- Ponowne włączenie aplikacji po wyłączeniu czyści dane ( punkt wyzej )
- Aplikacja ma bardzo niskie zapotrzebowanie pamięci, nie jest aplijacją prioretytową
- Przy 'zabiciu' aplikacji program traci wszystkie dane
- Brak dodatkowych funkcjonalności po zamknięciu aplkacji

<strong><em> 2. FUNKCJONALNOŚĆ </strong></em>

- Po uruchomieniu aplikacji widzimy 2 napisy u góry Początek wyjazdu oraz pod nim Koniec wyjazdu, na środku ekranu pojawia się kalendarz na którym będzemy zaznaczać naszą date wyjazdu oraz powrotu. Pod kalendarzem znajduje się napis Długosc wyjazdu przy ktorym bedzie wyswietlać się długość dni na wyjeździe. Na samym dole aplikacji znajdują się 2 przyciski: Początek wyjazdu oraz Koniec wyjazdu
- Automatycznie przy włączeniu aplikacji następuje blokada wyboru dat do 2 lat w przód
- Aby wybrać datę Początku wyjazdu należy najpierw wcisnąć przycisk "Początek wyjazdu" następnie zaznaczyć date na kalendarzu
- Następnie aby wybrać date końca wyjazdu należy wcisnąć przycisk "Koniec wyjazdu" następnie zaznaczyć date na kalendarzu
- Wybrane daty wyświetlane są u góry przy napisach Początek i Koniec wyjazdu
- Przy wybraniu daty Końca wyjazdu, automatycznie są obliczane dni wyjazdu i wyświetlają się one przy napisie "Dlugosc wyjazdu :"

<strong><em> 3. WERYFIKACJA I TESTOWANIE </strong></em>

- Program automatycznie wczytuje dzisiejszą date i umożliwia wybranie daty do 2 lat w przód
- Po wybraniu daty początku i końca wyjazdu, poprawnie oblicza dni wyjazdu
- wybrane daty wyświetlają się u góry ekranu
- Po wybraniu daty poczatku po dacie końca np : koniec wyjazdu "2022-12-29" a wybierzemy początek "2022-12-30". To data końca wyjazdu zostanie usunięta oraz długość wyjazdu zostanie zresetowana
