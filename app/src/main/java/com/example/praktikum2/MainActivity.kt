package com.example.praktikum2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Gacoan>(
            Gacoan(
                R.drawable.suit,
                nameGacoan = "Mie Suit",
                descGacoan = "Rp.9.500\n" + "Mie Suit sendiri terdiri dari mi putih polos tanpa cabai dengan rasa gurih asin.\n" +
                        "Saat disajikan, makanan tersebut dihidangkan dengan taburan ayam dan pangsit di atasnya."
            ),
            Gacoan(
                R.drawable.hompimpa,
                nameGacoan = "Mie Hompimpa",
                descGacoan =  "Level 1-4 Rp.9500\n" + "Level 6-8 Rp.10500\n"
                        + "Mie Hompimpa mempunyai rasa asin pedas dengan level kepedasan yang bisa dipesan sesuai selera.\n" +
                        "Menu satu ini sangat disarankan untuk kamu pencinta pedas karena rasa pedasnya seolah meledak di mulut."
            ),
            Gacoan(
                R.drawable.gacoan,
                nameGacoan = "Mie Gacoan",
                descGacoan =  "Mie gacoan level 1-4: Rp9.500\n" + "Mie gacoan level 6-8: Rp10.500\n" +
                        "Apabila ingin merasakan makanan dengan cita rasa pedas manis, Mie Gacoan adalah pilihannya."
            ),
            Gacoan(
                R.drawable.pangsit,
                nameGacoan = "Pangsit Goreng",
                descGacoan =  "Rp9.500\n" + "Menu Gacoan ini sendiri berisikan daging ayam cincang yang berbalut kulit yang renyah."
            ),
            Gacoan(
                R.drawable.siomay,
                nameGacoan = "Siomay",
                descGacoan =  "Rp8.600\n" + "Makanan pendamping ini berupa adonan udang yang dibungkus kulit siomay.\n" +
                        "Rasa yang dihasilkan cenderung gurih dengan tekstur yang lembut.\n"
            ),
            Gacoan(
                R.drawable.keju,
                nameGacoan = "Udang keju",
                descGacoan =  "Rp8.600\n" + " udang keju adalah salah satu menu dimsum yang disukai banyak orang.\n" +
                        "Hidangan ini berupa adonan dimsum yang dicampur dengan udang."
            ),
            Gacoan(
                R.drawable.rambutan,
                nameGacoan = "Udang Rambutan",
                descGacoan =  "Rp8.600\n" + "Udang rambutan sendiri terbuat dari bola daging yang dibalut dengan irisan kulit pangsit.\n" +
                        "Rasanya renyah dan garing di luar, tetapi dagingnya terasa lembut dan juicy!"
            ),
            Gacoan(
                R.drawable.lumpiah,
                nameGacoan = "Lumpiah Udang",
                descGacoan =  "Rp8.600\n" + "Lumpia udang adalah menu dimsum goreng lainnya yang bisa kamu pesan di Mie Gacoan.\n" +
                        "Dimsum ini memiliki tekstur yang cenderung lembut sehingga mudah digigit."
            ),
            Gacoan(
                R.drawable.ceker,
                nameGacoan = "Ceker Ayam",
                descGacoan =  "Rp8.600\n" + "Bagi pencinta ceker, tak ada salahnya untuk memesan menu ceker yang tersedia di Mie Gacoan.\n" +
                        "Tekstur ceker ini lunak dan mudah dikunyah."
            ),
            Gacoan(
                R.drawable.jeruk,
                nameGacoan = "Es Jeruk",
                descGacoan =  " Rp5.000\n" + "Rasa segar dari buah jeruknya tentu membuat sensasi pedas dari mi jadi berkurang."
            ),
            Gacoan(
                R.drawable.thai,
                nameGacoan = "Es Thai Tea",
                descGacoan =  "Rp7.700\n" + "Sama seperti thai tea pada umum, menu ini memiliki cita rasa yang manis dan menyegarkan."
            ),
            Gacoan(
                R.drawable.goak,
                nameGacoan = "Es Gobaksodor",
                descGacoan =  "Rp8.600\n" + "Es Gobak Sodor terbuat dari es buah dengan cincau lembut yang ditambah dengan susu kental manis."
            ),
            Gacoan(
                R.drawable.suku,
                nameGacoan = "Es Suku Bathok",
                descGacoan =  "Rp5.900\n" + "Menu Gacoan ini terbuat dari susu dan sirup moka yang lembut dan creamy."
            ),
            Gacoan(
                R.drawable.petak,
                nameGacoan = "Es Petak Umpet",
                descGacoan =  "Rp8.600\n" + "Minuman ini mengusung tema tropikal sehingga bakal memberimu sensasi segar saat meneguknya."
            ),
            Gacoan(
                R.drawable.teklek,
                nameGacoan = "Es Teklek",
                descGacoan =  "Rp5.900\n" + "Menu Gacoan ini berisikan berbagai buah segar dengan rasa yang manis."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = GacoanAdapter(this, superheroList){
            val intent = Intent (this, DetailGacoanActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
    }
    }
}
