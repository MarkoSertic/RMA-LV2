package markosertic.ferit.insipringperson

object Osobe {
    val poznateOsobe:MutableList<Osoba>
    init{
        poznateOsobe= postavipoznateOsobe();
    }

    private fun postavipoznateOsobe(): MutableList<Osoba> {
        val ZdravkoMamic= arrayOf("I zapamti, koga sam ja prokleo, a tebe proklinjem, taj nije dobro završio.",
        "Nećeš razbojniče.","Pa ja imam više prijatelja u Srbiji, nego cijela hrvatska vlada zajedno!","Dinamo hrani hrvatski nogomet. ")
        val BillGates= arrayOf("Don’t compare yourself with anyone in this world…if you do so, you are insulting yourself.",
            "I choose a lazy person to do a hard job. Because a lazy person will find an easy way to do it.",
            "If you are born poor it’s not your mistake, but if you die poor it’s your mistake.",
            "Treatment without prevention is simply unsustainable.")
        val AlbertEinstein= arrayOf("Few are those who see with their own eyes and feel with their own hearts.",
            "All religions, arts and sciences are branches of the same tree.",
        "A man should look for what is, and not for what he thinks should be.",
        "I believe in standardizing automobiles. I do not believe in standardizing human beings.")
    return mutableListOf(Osoba(
        1,
       "https://www.zagreb.info/wp-content/uploads/2015/05/zdravko-mamic-1.jpg",
        "Zdravko Mamić",
        " 16. srpnja 1959.",
        "Bio je nogometni dužnosnik i izvršni dopredsjednik zagrebačkog Dinama do 2016. kada je podnio ostavku s pozicije u Dinamu i HNS-u. Trenutno je Dinamov savjetnik. Svojim je radom doprinio velikim uspjesima Hrvatske nogometne reprezentacije s kulminacijom osvajanja drugog mjesta na Svjetskom nogometnom prvenstvu 2018.",
        ZdravkoMamic), Osoba(
        2,
        "https://www.mreza-mira.net/wp-content/uploads/2020/03/Bill-Gates-250x188-1.jpg",
        "Bill Gates",
        " 28. listopada 1955.",
        "Gates je jedan od najpoznatijih poduzetnika u revoluciji osobnog računalstva. Iako mu se mnogi dive, velik dio ljudi unutar softverske industrije njegovu poslovnu strategiju smatra antikonkurentnom, što je u nekim slučajevima dokazivano i na sudu. U kasnijim godinama karijere, Gates je donirao mnogo novca raznim humanitarnim organizacijama i programima znanstvenih istraživanja putem zaklade Bill & Melinda Gates Foundation, utemeljene 2000. godine.",
        BillGates), Osoba(
        3,
        "https://sites.google.com/site/znanstvenici/_/rsrc/1400232687509/poznati-znanstvenici/albert-einstein/albi.jpg",
        "Albert Einstein",
        " 14. ožujka 1879 -- 18. travnja 1955.",
        "Einsteinovo je glavno djelo njegova teorija relativnosti (1916.), koja je ne samo od osnovne važnosti kao temeljni okvir za daljnji razvoj teorijske fizike, već duboko zahvaća i u filozofske koncepcije, napose o prostoru i vremenu, a povrh toga u probleme kozmologije i kozmogonije. Einstein je neprekidno usavršavao teoriju relativnosti, pa je u posljednjim godinama života razvio takozvanu unificiranu teoriju polja, koja poopćuje njegovu teoriju gravitacije i uključuje teoriju elektromagnetizma.",
        AlbertEinstein)
    )
    }
    fun dohvatiOsobu(index:Int):Osoba?= poznateOsobe.find { poznateOsobe->poznateOsobe.index==index }
    fun dodajOsobu(novaOsoba: Osoba){
        poznateOsobe.add(novaOsoba)}
}