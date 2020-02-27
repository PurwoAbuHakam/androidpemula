package com.dicoding.ale.purwobeginner.model

import com.dicoding.ale.purwobeginner.R

object BugsData {
    private val bugsNames = arrayOf("Sweat Bee",
        "Fire Ant",
        "Bullhorn Acacia Ant",
        "Bald-Faced Hornet",
        "Yellow Jacket",
        "Honey Bee",
        "Red Harvester Ant",
        "Paper Wasp",
        "Tarantula Hawk",
        "Bullet Ant")

    //spi = Schmidt Pain Index
    private val spiList = arrayOf("1.0",
        "1.2",
        "1.8",
        "2.0",
        "2.0",
        "2.0",
        "3.0",
        "3.0",
        "4.0",
        "4.0+")

    private val bugsDetails = arrayOf(
        "Lebah memang berguna karena dapat menghasilkan madu bagi manusia. Tapi, hewan kecil, berbulu, bersayap, dan lucu ini tidak bisa dianggap remeh. Meski terlihat kecil dan imut, lebah memiliki sengatan yang sangat menyakitkan. Sengatan lebah bisa sangat mematikan lagi apabila orang yang disengat memiliki tingkat alergi yang sangat tinggi.\n" +
                "Dari sekian banyak jenis lebah, lebah sweat bee adalah lebah yang sengatannya harus diwaspadai. Sweat bee adalah keluarga lebah yang memiliki ukuran tubuh sedang. Ada yang berwarna hitam, kuning, danjuga hijau. Diberi nama sweat bee karena lebah jenis ini memiliki ketertarikan terhadap keringat manusia. Menurut index rasa sakit, lebah sweat bee memiliki tingkat sengat 1.0. Menjadikannya sebagai serangga peringkat terakhir dalam daftar serangga dengan sengatan paling menyakitkan di dunia.",
        "Meski merumakan binatang asli di daerah Amerika Selatan, penyebaran fire ant atau semut sangatlah luas. Tidak hanya di Amerika Selatan, banyak orang di negara berbeda yang juga menemukan fire ant di rumahnya. Bahkan kita yang di Indonesia juga pasti bisa menemukan sarang semut ini di pekarangan rumah.\n" +
                "Fire ant atau semut api memiliki ciri-ciri tubuh berwarna coklat dengan bagian perutnya yang hitam. Tubuhnya memang kecil, tapi semut yang termasuk genus solenopsis invicta ini dikenal sangatlah agresif. Mereka tidak akan ragu-ragu menyerang siapapun yang berani mengganggu sarang mereka. Schimidt pain index memberi nilai 1.2 bagi semut api ini.",
        "Nama serangga yang terdengar mengerikan ini diperoleh dari pohon dimana mereka sering ditemukan yaitu pohon bullhorn acacia. Semut bullhorn acacia membangun simbiosis mutualisme dengan pohon tempat mereka tinggal. Pohon bullhorn acacia sebagai penyedia tempat tinggal dan makanan, sedangkan semut melindungi pohon dari hewan herbivora yang ingin menyantap daun dari pohon bullhorn.\n" +
                "Berdasarkan index Schimdt, semut bullhorn acacia memiliki sengatan yang cukup menyakitkan. Semut ini mendapatkan nilai 1.8 menurut index Schmidt. Dengan mata yang besar dan tubuhnya yang berwarna oranye, semut ini sering dianggap sebagai \"tawon\" di dunia semut. Disengat semut ini sama saja seperti dijepret dengan karet.",
        "Jika diurutkan dari yang paling kecil, maka urutannya adalah lebah, tawon, barulah hornet. Bisa dikatakan bahwa hornet adalah tawon dengan steroid. Jadi, ukurannya jelas lebih besar daripada lebah biasa, tapi dengan tingkat keagresifan yang sama tingginya dengan tawon. Hornet dan tawon bisa menyengat orang berkali-kali tanpa rasa takut.\n" +
                "Bald-face hornet adalah hornet yang berhasil masuk ke dalam daftar serangga dengan sengatan paling menyakitkan. Dengan ciri-ciri tubuh berwarna hitam dengan tanda putih di sekitar perut dan kepala, hornet ini masuk dalam skala 2.0 dalan Schmidt Pain Index. Disengat dengan serangga satu ini bisa mengakibatkan bengkak yang bisa bertahan dalam jangka waktu 24 jam.",
        "Di urutan selanjutnya mimpi baruk manusia, adalah serangga bernama yellow jacket. Yap, yellow jacket adalah salah satu jenis tawon yang cukup dikenal. Apalagi kalau bukan karena sengatannya yang mematikan. Di dunia hewan, semakin terang atau mencolok warna hewan tersebut, itu tandanya adalah hewan yang harus diwaspadai. Nah, yellow jacket ini salah satunya.\n" +
                "Warna kuning-hitam di tubuhnya menandakan bahwa, jika ada orang yang berani mengganggunya, maka serangga ini tidak akan ragu untuk menyengat orang tersebut. Bukan hanya sekali, melainkan berkali-kali. Berdasarkan index Schmidt, yellow jacket merupakan serangga dengan sengatan mematikan ke-6 di dunia dengan skor 2.0.",
        "Banyak orang yang menanyakan, seberapa sakit sih sengatan lebah madu? Diketahui sebagai salah satu hewan bermanfaat karena dapat menghasilkan madu, lebah memiliki cara bertahan diri dengan cara menyengat. Sayangnya, karena duri sengat mereka tersambung dengan bagian dalam organ perutnya, begitu mereka menyengat, lebah madu akan mati segera setelah mencabut duri sengatnya.\n" +
                "Membahas seberapa sakit sengatan dari lebah madu. Lebah madu masuk peringkat 5 dalam daftar serangga dengan sengatan paling mematikan, dengan index 2.0. Beruntungnya bagi manusia, lebah sangat berbeda dengan tawon dan hornet. Lebah hanya akan menyengat bila mereka benar-benar dalam kondisi terancam.",
        "Dari sekian banyak jenis semut, semut harvester adalah semut dengan sengatan paling mematikan kedua dari semua semut yang ada. Dirinya kalah dengan semut peluru yang sengatannya seperti ditembak peluru. Lalu, apakah berarti sengatan dari semut ini tidak menyakitkan? Tidak menurut Schmidt.\n" +
                "Berdasarkan index Schmidt, semut harvester memiliki skor sengatan 3.0. Yang artinya, semut ini adalah serangga dengan sengatan paling menyakitkan nomor 4 di dunia. Semut harvester memiliki kepala yang nyaris berbentuk kotak, tubuh panjang, berwarna merah, dan tidak memiliki tulang belakang.",
        "Di urutan 3 besar serangga dengan sengatan paling menyakitkan di dunia ada nama paper wasp atau tawon kertas. Paper wasp atau umbrella wasp ini memiliki tubuh berwarna coklat dengan sejumlah warna kuning di tubuh dan sayap. Dinamakan tawon kertas karena tawon ini menggunakan air liur mereka untuk membuat sarang yang terbuat dari tanaman hingga mirip seperti kertas.\n" +
                "Inilah salah satu jenis serangga yang tidak bisa kalian anggap remeh. Bukan karena tawon bisa menyengat berkali-kali, tapi juga karena satu saja sengatan tawon bisa menyebabkan rasa sakit seperti terbakar. Menurut index Schmidt, tawon kertas mendapatkan skor 3.0 atas efek terbakar yang disebabkan oleh sengatan tawon kertas.",
        "Laba-laba tarantula saja bisa membuat semua orang bergidik, apalagi jika mereka mendengar ada tawon yang bisa membunuh tarantula. Tarantulah hawk, begitulah nama yang diberikan untuk tawon ini karena mereka adalah jenis tawon yang dapat mengalahkan dan membunuh tarantula. Jika tarantula saja takut bertemu dengan tawon jenis ini, maka sudah sepatutnya kalian juga takut.\n" +
                "Memiliki tubuh hitam dengan sayapnya yang berwarna coklat terang, tarantula hawk memiliki kaki panjang dengan cakarnya yang berbentuk seperti pengait. Sengaja didesain untuk membuat mangsanya tidak bisa lari darinya. Sengatan dari tarantula hawk sangatlah menyakitkan, rasanya seperti disetrum listrik dan mampu membuat orang terbujur kaku. Sengatan mematikannya tersebut diberi skor 4.0.",
        "Dari semua serangga di dunia dan juga semua semut yang ada, semut peluru atau bullet ant adalah semut sekaligus serangga dengan sengatan yang paling menyakitkan di dunia. Rasa sakit yang disebabkan oleh sengatan semut ini diperkirakan mirip seperti ditembak peluru atau sama seperti tumit yang tertancap paku panas sepanjang 3 inci.\n" +
                "Ya, menurut index Schmidt, rasa sakit dan efek terbakar yang disebabkan oleh semut peluru ini sangatlah intens. Membuat semut ini mendapatkan skor 4.0+. Karena rasa sakit yang diibaratkan sama seperti ditembak peluru, tidak banyak orang yang mau disengat oleh serangga satu ini. Diketahui, efek sengatan semut peluru bisa bertahan lebih dari 24 jam.")

    private val bugsImages = intArrayOf(R.drawable.sweet_bee,
        R.drawable.fire_ant,
        R.drawable.bullhorn_acacia_ant,
        R.drawable.bald_faced_hornet,
        R.drawable.yellow_jacket,
        R.drawable.honey_bee,
        R.drawable.red_harvester_ant,
        R.drawable.paper_wasp,
        R.drawable.tarantula_hawk,
        R.drawable.bullet_ant)

    val listData: ArrayList<Bugs>
        get() {
            val list = arrayListOf<Bugs>()
            for (position in bugsNames.indices) {
                val bugs = Bugs()
                bugs.name = bugsNames[position]
                bugs.spi= spiList[position]
                bugs.detail = bugsDetails[position]
                bugs.photo = bugsImages[position]
                list.add(bugs)
            }
            return list
        }
}