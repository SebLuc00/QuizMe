package quizme.quizmee;


public class Lib {

    private String mQuestions [] = {
            "Jaki jest największy ocean na świecie?",
            "Jaki jest najmniejszy ptak na kuli ziemskiej",
            "Rozdzielczość 4K to:",
            "Z ilu kości wchodzi w układ kostny dorosłego człowieka",
            "W jakim stanie w USA znajduje się góra Rushmore ",
            "Delfiny to:",
            "Jaką chemiczną nazwę ma woda utleniona ?",
            "W jakim mieście znajduje sie Panorama Racławicka ?",
            "Ile stacji liczy sobie metro w Nowym Jorku ?",
            "W którym roku odbyła sie bitwa pod Grunwaldem ?",
            "Do jakiego państwa należy wyspa Sumatra ?",
            "Jaką nazwę nosiło obecne miasto Stambuł",
            "W jakim mieście kończy się słynna Route 66 ?",
            "Według mitologi greckiej Plutos był bogiem",
            "Symbol jakiego zwierzęcia miał na kurtce główny bohater filmu \"Drive\" ?",
            "Na terenie jakiego kraju podczas II wojny światowej powstało  Państwo Vichy ?",
            "Jaką nieficjalną nazwę miał samolot który zrzucił bombę Little Boy na Hiroszimę ?",
            "Od jakiego zwierzęcia pochodzi gatunek piwa Bock ?",
            "Jak nazywa się główna postać seri gier Wolfenstain ?",
            "W jakim stanie w USA znajduje sie miasto Denver",
            "Jaka grupa krwi jest uniwersalnym biorcą?",
            "Jaka grupa krwi jest uniwersalnym dawcą?",
            "W której warstwie atmosfery znajdują się chmury?",
            "Kiedy powiemy, że dwa wektory są ortogonalne?",
            "Tarcie występujące między ciałami nieporuszającymi się względem siebie to tarcie?",
            "Ugięcie promieni świetlnych na krawędzi ciał nieprzezroczystych to?",
            "Jaki jest ładunek elektryczny neutronu?",
            "Ile stanów ma bit?",
            "Jakie miasto jest konstytucyjna stolicą Holandii?",
            "Symbol Kampinowskiego Parku Narodowego?",
            "Co na czubku miałą kaczka dziwaczka?",
            "Jaki gaz sprawia że soda wytwarza bąbelki?",
            "Jakie ksztłty tworzą symbol olimpijski?",
            "Znany karzeł z serialu 'Gra o Tron'?",
            "Ojciec Luka Skywalkera z sagi 'Star Wars'",
            "Rok w którym odbyło się Powstanie warszawskie?",
            "Najmniejsze województwo to?",
            "Pierwsza przegrana bitwa Napoleona miała miejsce pod?",
            "H2SO4 to wzór ?",
            "Ile czasu zajmuje światłu droga ze Słońca na Ziemię?"


    };


    private String mChoices [][] = {
            {"Ocean Indyjski", "Ocean Spokojny", "Ocean Atlantycki","Ocean Arktyczny"},
            {"Gołąb", "Jastrząb", "Koliber", "Sikorka"},
            {"4096×2048", "2560×2048", "8192×4096", "1920×1080"},
            {"198", "185", "215", "206"},
            {"Dakota Południowa", "California", "Utah", "Nevada"},
            {"Ryby", "Płazy", "Ssaki", "Gady"},
            {"Tlenek diazotu ", "Podtlenek węglanu", "Nadtlenek wodoru", "Azotan wodorowy"},
            {"Kraków", "Racławice", "Poznań", "Wrocław"},
            {"468", "535", "146", "334"},
            {"1410", "1462", "1450", "1406"},
            {"Tajwan", "Filipiny", "Malezja", "Indonezja"},
            {"Istambuł", "Konstantynopol ", "Kapadocja", "Aleksandria"},
            {"Chicago", "Miami", "Los Angeles", "Nowy Jork"},
            {"Bogactwa", "Mądrości", "Pożądania", "Wojny"},
            {"Lwa", "Skorpiona", "Tygrysa", "Pająka"},
            {"Niemcy", "Belgia", "Francja", "Austria"},
            {"Charlie", "Alpha Boy", "Winged Hussar", "Enola Gay"},
            {"Myszy", "Kozła", "Pantery", "Konia"},
            {"William Blazkowicz", "Isaac Clark", "Nathan Drake", "Andrew Ryan"},
            {"Montana", "Karolina Południowa", "Kolorado", "Nebraska"},
            {"AB", "B", "A", "0"},
            {"AB", "A", "B", "0"},
            {"Troposferze ", "Stratosferze", "Mezosferze", "Termosferze"},
            {"są prostpoadłe", "są równloegłe", "są takie same", "żaden z powyższych"},
            {"dynamiczne", "statyczne", "tarcie graniczne", "tarcie slizgowe"},
            {"interferencja", "dyfrakcja", "dyfuzja", "interakcja"},
            {"dodatni", "ujemny", "neutralny", "żadne"},
            {"1", "2", "3", "4"},
            {"Rotterdam", "Haga", "Amsterdam", "Arnhem"},
            {"żubr", "łoś", "dzik", "kuna"},
            {"kokardkę", "chusteczkę", "kapelusz", "czapeczkę"},
            {"powietrze", "azot", "metan", "CO2"},
            {"pierścienie", "trójkąty", "flagi", "kwadraty"},
            {"Geralt", "Tyrion", "Little finger", "Aidan"},
            {"Ben", "Robert", "Anakin", "William"},
            {"1941", "1942", "1943", "1944"},
            {"Mazowieckie", "Podlaskie", "Opolskie", "Wielkopolskie"},
            {"Jeną", "Borodino", "Waterloo", "Aspern"},
            {"kwasu solnego", "tlenku węgla", "wodorotlenku miedzi", "kwasu siarkowego"},
            {"3 s", "8 min", "60 min", "1 min"}

    };



    private String mCorrectAnswers[] = {"Ocean Spokojny", "Koliber", "4096×2048", "206", "Dakota Południowa","Ssaki","Nadtlenek wodoru","Wrocław","468","1410","Indonezja","Konstantynopol","Los Angeles","Bogactwa","Skorpiona","Francja","Enola Gay","Kozła","William Blazkowicz","Kolorado","AB","0","Troposferze","są prostpoadłe","statyczne","dyfrakcja","neutralny","2","Amsterdam","łoś","kokardkę","CO2","pierścienie","Tyrion","Anakin","1944","Opolskie","Aspern","kwasu siarkowego","8 min" };

    private int Los [] = {};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice2 = mChoices[a][3];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}