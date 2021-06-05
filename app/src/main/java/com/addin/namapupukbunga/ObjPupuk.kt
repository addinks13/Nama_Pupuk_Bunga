package com.addin.namapupukbunga

object ObjPupuk {
    private val namePupukBunga = arrayOf(
        "GDM Pupuk Organik Cair",
        "Mutiara Pupuk NPK 16-16-16",
        "Pupuk Organik MAGICgro G8",
        "Hyponex20-20-20",
        "HydrofarmNutrisi FlowerMix AB (cair)",
        "Golstar 250 SC",
        "Hormon Perangsang Bunga",
        "NEOBoost Flowers",
        "Pupuk Hidroponik AB Mix Bunga",
        "Grow MoreNPK 10-55-10"
    )
    private val detailPupukBunga = arrayOf(
        "Pupuk organik khusus untuk tanaman hias dari GDM ini memiliki banyak manfaat penting bagi tanaman. Mulai dari menyuburkan tanah, menunjang perkembangan akar, sampai kepada meningkatkan penyerapan nutrisi. Pupuk ini juga dapat menjadikan warna bunga lebih cerah.\n" +
                "\n" +
                "GDM dapat digunakan untuk aneka jenis tanaman hias yang memiliki daun dan bunga, seperti mawar, anggrek, dan tulip. Pupuk ini juga cocok untuk berbagai jenis bonsai dan kaktus. Untuk Anda yang tidak mau repot membedakan pemakaian pupuk, produk GDM merupakan solusi yang tepat!",
        "Pupuk Mutiara yang satu ini mengandung unsur hara dengan kombinasi seimbang di setiap butirannya. Tujuannya adalah untuk memfasilitasi pertumbuhan tanaman secara optimal, baik pertumbuhan vegetatif maupun generatif. Meski berbentuk padat, pupuk ini mudah larut dalam air sehingga memudahkan pemberian dan memaksimalkan penyerapan oleh tanaman.\n" +
                "\n" +
                "Kombinasi nitrat-nitrogen dengan amonium-nitrogen yang terkandung di dalam pupuk ini dapat memacu pertumbuhan tanaman lebih cepat. Oleh karena itu, hasil panen pun menjadi lebih banyak.",
        "MAGICgro G8 merupakan pupuk organik yang dapat diaplikasikan pada semua jenis tanaman, baik sayur, buah, maupun tanaman pangan. Kelebihannya adalah dapat diaplikasikan di semua usia tanaman dan dapat dicampur dengan pestisida dan pupuk lainnya. \n" +
                "\n" +
                "Pupuk ini juga dapat meningkatkan daya tahan tanaman terhadap serangan penyakit. Selain mencegah serangan hama, dapat juga mempercepat panen, membuat panen serempak, dan hasil panen lebih seragam.",
        "Pupuk ini memiliki kandungan NPK 20: 20: 20, unsur mikro, serta vitamin yang seimbang. Sangat bermanfaat untuk beragam tanaman bunga, bahkan untuk bunga anggrek yang membutuhkan perawatan khusus. Anda bisa melarutkan pupuk ini dengan mudah untuk disiramkan pada tanaman atau disemprotkan pada bagian daun.\n" +
                "\n" +
                "Pupuk ini dapat digunakan pada semua fase pertumbuhan, termasuk untuk pertumbuhan vegetatif. Selain itu, bagus juga untuk pertambahan volume dan jumlah daun, serta untuk membantu merangsang mekarnya bunga.",
        "Pupuk ini merupakan nutrisi hidroponik dengan kandungan unsur hara yang penting bagi pertumbuhan berbagai jenis tanaman bunga. Dapat diaplikasikan pada bunga mawar, krisan, anggrek, dan lainnya. Kandungannya menunjang pertumbuhan tanaman bunga agar menjadi lebih subur dan segar. ",
        "Golstar adalah pupuk ZPT (Zat Pengatur Tumbuh) yang memungkinkan Anda mengatur pembungaan tanpa menyebabkan pertumbuhan yang abnormal. Anda bisa menikmati pertumbuhan bunga dengan lebih cepat, baik itu bunga hias maupun pembungaan pada tanaman buah.\n" +
                "\n" +
                "Golstar mengandung hormon stimulan yang mampu menghambat pertumbuhan vegetatif agar nutrisi pada tanaman lebih terpusat ke pertumbuhan generatif. Hal ini sangat cocok untuk Anda yang ingin fokus menumbuhkan bunga dan buah. Tanaman kesayangan Anda pun akan menghasilkan bunga dan buah dengan baik dan lebih banyak.",
        "Pupuk yang satu ini berfungsi sebagai hormon untuk merangsang pertumbuhan bunga pada tanaman bunga hias Anda. Bunga anggrek dan mawar Anda akan berbunga dengan baik dan terhindar dari kerontokan. Dengan kandungan vitamin dan mineral di dalamnya, jumlah bunga yang muncul lebih banyak dan lebih cerah warnanya.\n" +
                "\n" +
                "Kemasannya dirancang dalam bentuk spray agar lebih praktis saat disemprotkan ke tanaman. Anda tidak perlu memperhitungkan dosis yang dibutuhkan seperti yang harus dilakukan ketika mencairkan pupuk berbentuk padat. Sangat cocok dan praktis bagi Anda yang sibuk sekaligus tetap ingin merawat tanaman.",
        "Pupuk NEOBoost Flowers termasuk kategori pupuk organik yang efektif dalam meningkatkan kualitas tanah. Asam amino, nutrisi, dan vitamin yang terkandung di dalamnya mampu menyuburkan tanah secara maksimal. Sangat cocok bagi Anda yang ingin memberikan perawatan khusus untuk mawar dan anggrek!\n" +
                "\n" +
                "Kandungan bahan-bahan alami di dalamnya juga berfungsi menjadikan tanaman lebih tahan terhadap serangan hama dan penyakit. Di samping itu, pupuk ini mampu merangsang dan mempercepat pertumbuhan bunga sekaligus mencegah tidak mudah rontok. Bila Anda penyuka tanaman dan tetap ingin menjaga kesuburan tanah, NEOBoost Flowers dapat menjadi pilihan.",
        "Pupuk yang satu ini mengandung unsur hara mikro dan makro yang dibutuhkan oleh tanaman untuk tumbuh secara optimal. Produk ini mudah larut dalam air sehingga memudahkan penyerapan dan cocok untuk berbagai jenis tanaman bunga hias.\n" +
                "\n" +
                "Dengan unsur haranya yang lengkap, pupuk Purie Garden efektif meningkatkan pertumbuhan tanaman budi daya lainnya. Meskipun nama produk ini menyertakan kata hidroponik, pupuk ini juga bisa digunakan pada media tanah dan lainnya. Ayo mulai menanam di pekarangan rumah Anda dengan teknik hidroponik!",
        "Pupuk ini diperuntukkan bagi tanaman yang membutuhkan unsur fosfat dalam jumlah tinggi agar bunganya tumbuh dengan baik. Sesuai namanya, kandungan tiga bahan adalah natrium 10, fosfat 55. dan kalium 10. Dapat terlihat bahwa zat fosfatnya cukup tinggi sehingga ampuh mendukung pertumbuhan bunga lebih cepat dan sehat.\n" +
                "\n" +
                "Produk ini sendiri berbentuk kristal berwarna biru yang sangat mudah larut dalam air. Aplikasikanlah dengan cara menyemprotkannya ke daun atau disiram ke dalam tanah. Bagi Anda yang ingin tanaman memiliki pertumbuhan bunga makin baik, produk ini bisa menjadi pilihan."
    )
    private val imgPupukBunga = intArrayOf(
        R.drawable.gdm,
        R.drawable.mutiara,
        R.drawable.magicpro,
        R.drawable.hyponex,
        R.drawable.flower,
        R.drawable.golstar,
        R.drawable.bunga,
        R.drawable.boos,
        R.drawable.hidropinikab,
        R.drawable.growmore
    )

    val listData : ArrayList<ClassPupuk>
    get() {
        val list = arrayListOf<ClassPupuk>()
        for (position in namePupukBunga.indices){
            val classPupuk= ClassPupuk()
            classPupuk.namePupuk = namePupukBunga[position]
            classPupuk.descPupuk = detailPupukBunga[position]
            classPupuk.imgPupuk = imgPupukBunga[position]
            list.add(classPupuk)
        }
        return list
    }
}