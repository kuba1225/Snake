# 1. Nazwa programu
Snake

# 2. Cel programu
Program *Snake* jest prostą implementacją klasycznej, znanej wszystkim gry *Snake*. Program został stworzony w języku Java 
i zaprojetkowany w taki sposób, aby oddzielić warstwę logiki aplikacji od interfejsu graficznego. Dzięki takiemu rozwiązaniu późniejsza zmiana
interfejsu będzie o wiele łatwiejsza i nie będzie wymagała zaglądania do warstwy logiki aplikacji. 
Właściwość tą wykorzystałem podczas przenoszenia owej aplikacji na platformę Android - implementacja gry na platformę Android znajduje
się w oddzielnym repozytorium.
# 3. Obsługa programu
Program możemy uruchomić za pomocą systemowego wiersza poleceń:
```
java −jar Snake.jar
```
Plik wykonywalny *Snake.jar* znajduje się w folderze *dist*. Aby uruchomić program można również dwa razy kliknąć na plik *Snake.jar*. 

Po uruchomieniu wyświetlone zostaje menu główne aplikacji:

<img src="https://github.com/kubabar1/Snake/blob/master/readme_img/main_menu.png" width="500">

W menu głównym aplikacji mamy do wyboru cztery możliwości:<br/>
<ul>
<li> START </li>
<li> WYNIKI </li>
<li> USTAWIENIA </li>
<li> WYJŚCIE </li>
</ul>

## 3.1 Panel ustawień
<img src="https://github.com/kubabar1/Snake/blob/master/readme_img/settings.png" width="500">
</br>
W panelu ustawień mamy możliwość wyboru koloru węża oraz szybkości z jaką porusza się wąż. Szybkość poruszania się węża ma wpływ na liczbę
zdobywanych przez gracza punktów (im szybciej się porusza, tym więcej punktów zostaje naliczonych po zjedzeniu przez węża owocu).

## 3.2 Panel wyników
<img src="https://github.com/kubabar1/Snake/blob/master/readme_img/high_scores.png" width="500">
</br>
W panelu tym wyświetlane są wszystkie wyniki otrzymane podczas gry.

## 3.3 Panel gry
<img src="https://github.com/kubabar1/Snake/blob/master/readme_img/game_panel.png" width="500">
</br>
Główny panel gry. Sterowanie wężem odbywa się za pomocą strzałek.

## 3.4 Panel *Game Over*
<img src="https://github.com/kubabar1/Snake/blob/master/readme_img/game_over.png" width="500">
</br>
Panel ten jest wyświetalny po wykonaniu błędnego ruchu (najechaniu na ścianę lub uderzeniu w samego siebie). W panelu tym wyświetlana
jest liczba punktów przez nas zdobytych. W pole tekstowe powinniśmy wpisać nasze imię, a następnie wybrać za pomocą przycisku, co chcemy
robić dalej (kontynuować rozgrywkę, czy powrócić do menu). Jeżeli nie podamy swojego imienia jako login zostanie dodany do tabeli wyników 
słowo "Anonim".


# 4. Opis modułów
## 4.1 snakeLogic
## 4.1.1 PointsComparator
Klasa ta zawiera implementację prostego komparatora wykorzystywanego podczas sortowania wyników prezentowanych w *Panelu wyników* .
Wyniki są przechowywane w pliku *HighScores.java* . Wyniki są sortowane w kolejności malejącej.
</br></br>
**Metody**
- compare(User o1, User o2) - metoda porównująca dwa obiekty </br>

## 4.1.2 User
Klasa ta reprezentuje użytkownika danej aplikacji. Pojedyńczy obiekt przechowuje nazwę użytkownika oraz liczbę jego punktów.
</br></br>
**Metody**
- metody dostępowe oraz nadpisane metody *equals* i *hashCode* </br>

## 4.1.3 Position
Klasa ta reprezentuje współrzędne położenia punktów na osi *x* oraz *y* .
</br></br>
**Metody**
- metody dostępowe oraz nadpisane metody *equals* i *hashCode* </br>

## 4.1.4 Snake
Klasa ta reprezentuje obiekt węża. Obiekt ten zawiera listę punktów składowych ciała węża, oraz jego sumaryczną długość.
</br></br>
**Metody**
- metody dostępowe </br>

## 4.1.5 SnakeLogic
Klasa ta zawiera implementację głównej logiki programu. Wąż reprezentowany jest przez zespół punktów (obiektów klasy *Position* ). Po 
"zjedzeniu" czerwonego punktu generowany jest kolejny czerwony punkt a długość węża zwiększa się o jeden (dodawany jest kolejny punkt do 
listy współżędnych poszczególnych jego punktów składowych). W każdej chwili czasowej wywoływana jest metoda *updatePosition* , która
oblicza kolejną współrzędną głowy węża, zależnie od tego w którą stronę wąż się poruszał. Tutaj również znajduje się słuchacz klawiatury, 
który jest odpowiedzialny za sterowanie wężem.
</br></br>
**Metody**
- initSnake() - metoda ta inicjuje nowy obiekt węża po rozpoczęciu gry,</br>
- generateFruit() - metoda ta generuje nowe owoce na planszy rozgrywki po "zjedzeniu" ich przez węża,</br>
- updatePosition() - metoda ta po każdej chwili czasowej jest wywoływana w celu aktualizacji kolejnych współrzędnych poruszającego się
węża</br>

## 4.2 snakeGUI
## 4.2.1 GameOverPanel
Klasa ta zawiera implementację powyżej opisanego panelu *Game Over* .
</br></br>
**Metody**
- writeToFile() - metoda ta zapisuje podany nick oraz liczbę zdobytych przez gracza punktów do pliku "HighScores.txt"</br>

## 4.2.2 GraphicsTools
Klasa ta zawiera dodatkowe metody wspierające graficzny interfejs.
</br></br>
**Metody**
- drawLines(Graphics2D g2d, Color linesColor) - metoda ta służy do rysowania pionowych i poziomych linii na panelu gry <br/>

## 4.2.3 HighScoresPanel
Klasa ta zawiera implementację powyżej opisanego panelu *High Scores* .
</br></br>
**Metody**
- readFromFile() - metoda ta służy do odczytywania danych przechowujących wyniki rozgrywki, znajdujących się w pliku "HighScores.txt" <br/>

## 4.2.4 MainFrame
Klasa ta implementuje główną ramkę programu, w której są wyświetlane poszczególne panele.

## 4.2.5 MenuPanel
Klasa ta zawiera implementację powyżej opisanego panelu *Main Menu* .
</br></br>
**Metody**
- głównie metody inicjalizujące oraz obsługujące przyciski <br/>

## 4.2.6 SettingsPanel
Klasa ta zawiera implementację powyżej opisanego panelu *Settings* .
</br></br>
**Metody**
- głównie metody inicjalizujące oraz obsługujące przyciski <br/>

## 4.2.7 SnakePanel
Klasa ta wyświetla główny panel gry.
</br></br>
**Metody**
- drawFruit(Graphics2D g2d) - metoda ta służy do narysowania na planszy czerwonego punktu - owoc który ma zosatać "zjedzony" przez węża,<br/>
- gameOver(Graphics g) - metoda wyświetlająca panel *Game Over* po popełnieniu przez gracza błędu,<br/>
- repaintBackground(Graphics2D g2d) - metoda odświeżająca wygląd tła (pionowe i poziome linie na planszy),<br/>
- drawSnake(Graphics2D g2d) - netoda ta rysuje współrzędne węża na planszy w kolejnych chwilach czasowych,<br/>
- actionPerformed(ActionEvent e) - metoda ta wywołuje w każdej chwili czasowej ustalonej przez timer metodę *repaint()* <br/>

# 5. Opis wykorzystanych struktur
Jedyną wykorzystaną strukturą jest *ArrayList* . Służy ona do przechowywania punktów składowych ciała węża. Po najechaniu na 
czerwony punkt długość węża zwiększa się, a do owej listy jest dodawany kolejny punkt. 

# 6. Podsumowanie
Program *Snake* działa poprawnie i spełnia początkowe założenia. Graficzny interfejs jest poprawnie zaimplementowany, a dzięki oddzieleniu
warstwy logiki aplikacji od jej warstwy graficznej, bardzo szybko można zmienić interfejs na inny. 
