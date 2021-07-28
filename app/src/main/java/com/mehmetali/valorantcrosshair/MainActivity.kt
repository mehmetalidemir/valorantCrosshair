package com.mehmetali.valorantcrosshair

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

        val imageList = listOf<Image>(
            Image(
                R.drawable.shroud,
                "SHROUD",
                "Crosshair Color  ->  Green\n" +
                        "Outlines  ->  On\n" +
                        "Center Dot  ->  Off\n" +
                        "\n"+
                        "Inner Line Opacity  ->  1\n" +
                        "Inner Line Length  ->  5\n" +
                        "Inner Line Thickness  ->  2\n" +
                        "Inner Line Offset  ->  2\n" +
                        "\n"+
                        "Outer Line Opacity  ->  0\n" +
                        "Outer Line Length  ->  0\n" +
                        "Outer Line Thickness  ->  0\n" +
                        "Outer Line Offset  ->  0\n" +
                        "\n"+
                        "Movement Error  ->  On\n" +
                        "Firing Error  ->  On"
            ),
            Image(
                R.drawable.dizzy,
                "DIZZY",
                "Crosshair Color  ->  Green\n" +
                        "Outlines  ->  On\n" +
                        "Center Dot  ->  Off\n" +
                        "\n"+
                        "Inner Line Opacity  ->  1\n" +
                        "Inner Line Length  ->  5\n" +
                        "Inner Line Thickness  ->  2\n" +
                        "Inner Line Offset  ->  2\n" +
                        "\n"+
                        "Outer Line Opacity  ->  0\n" +
                        "Outer Line Length  ->  0\n" +
                        "Outer Line Thickness  ->  0\n" +
                        "Outer Line Offset  ->  0\n" +
                        "\n"+
                        "Movement Error  ->  On\n" +
                        "Firing Error  ->  On"
            ),
            Image(
                R.drawable.aceu,
                "ACEU",
                "Crosshair Color  ->  Green\n" +
                        "Outlines  ->  On\n" +
                        "Center Dot  ->  Off\n" +
                        "\n"+
                        "Inner Line Opacity  ->  1\n" +
                        "Inner Line Length  ->  5\n" +
                        "Inner Line Thickness  ->  2\n" +
                        "Inner Line Offset  ->  2\n" +
                        "\n"+
                        "Outer Line Opacity  ->  0\n" +
                        "Outer Line Length  ->  0\n" +
                        "Outer Line Thickness  ->  0\n" +
                        "Outer Line Offset  ->  0\n" +
                        "\n"+
                        "Movement Error  ->  On\n" +
                        "Firing Error  ->  On"
            ),
            Image(
                R.drawable.hiko,
                "HIKO",
                "Crosshair Color  ->  Green\n" +
                        "Outlines  ->  On\n" +
                        "Center Dot  ->  Off\n" +
                        "\n"+
                        "Inner Line Opacity  ->  1\n" +
                        "Inner Line Length  ->  5\n" +
                        "Inner Line Thickness  ->  2\n" +
                        "Inner Line Offset  ->  2\n" +
                        "\n"+
                        "Outer Line Opacity  ->  0\n" +
                        "Outer Line Length  ->  0\n" +
                        "Outer Line Thickness  ->  0\n" +
                        "Outer Line Offset  ->  0\n" +
                        "\n"+
                        "Movement Error  ->  On\n" +
                        "Firing Error  ->  On"
            ),
            Image(
                R.drawable.shahzam,
                "SHAHZAM",
                "Crosshair Color  ->  Green\n" +
                        "Outlines  ->  On\n" +
                        "Center Dot  ->  Off\n" +
                        "\n"+
                        "Inner Line Opacity  ->  1\n" +
                        "Inner Line Length  ->  5\n" +
                        "Inner Line Thickness  ->  2\n" +
                        "Inner Line Offset  ->  2\n" +
                        "\n"+
                        "Outer Line Opacity  ->  0\n" +
                        "Outer Line Length  ->  0\n" +
                        "Outer Line Thickness  ->  0\n" +
                        "Outer Line Offset  ->  0\n" +
                        "\n"+
                        "Movement Error  ->  On\n" +
                        "Firing Error  ->  On"
            ),
            Image(
                R.drawable.sick,
                "SICK",
                "Crosshair Color  ->  Green\n" +
                        "Outlines  ->  On\n" +
                        "Center Dot  ->  Off\n" +
                        "\n"+
                        "Inner Line Opacity  ->  1\n" +
                        "Inner Line Length  ->  5\n" +
                        "Inner Line Thickness  ->  2\n" +
                        "Inner Line Offset  ->  2\n" +
                        "\n"+
                        "Outer Line Opacity  ->  0\n" +
                        "Outer Line Length  ->  0\n" +
                        "Outer Line Thickness  ->  0\n" +
                        "Outer Line Offset  ->  0\n" +
                        "\n"+
                        "Movement Error  ->  On\n" +
                        "Firing Error  ->  On"
            ),
            Image(
                R.drawable.skadoodle,
                "SKADOODLE",
                "Crosshair Color  ->  Green\n" +
                        "Outlines  ->  On\n" +
                        "Center Dot  ->  Off\n" +
                        "\n"+
                        "Inner Line Opacity  ->  1\n" +
                        "Inner Line Length  ->  5\n" +
                        "Inner Line Thickness  ->  2\n" +
                        "Inner Line Offset  ->  2\n" +
                        "\n"+
                        "Outer Line Opacity  ->  0\n" +
                        "Outer Line Length  ->  0\n" +
                        "Outer Line Thickness  ->  0\n" +
                        "Outer Line Offset  ->  0\n" +
                        "\n"+
                        "Movement Error  ->  On\n" +
                        "Firing Error  ->  On"
            ),
            Image(
                R.drawable.tenz,
                "TENZ",
                "Crosshair Color  ->  Green\n" +
                        "Outlines  ->  On\n" +
                        "Center Dot  ->  Off\n" +
                        "\n"+
                        "Inner Line Opacity  ->  1\n" +
                        "Inner Line Length  ->  5\n" +
                        "Inner Line Thickness  ->  2\n" +
                        "Inner Line Offset  ->  2\n" +
                        "\n"+
                        "Outer Line Opacity  ->  0\n" +
                        "Outer Line Length  ->  0\n" +
                        "Outer Line Thickness  ->  0\n" +
                        "Outer Line Offset  ->  0\n" +
                        "\n"+
                        "Movement Error  ->  On\n" +
                        "Firing Error  ->  On"
            ),
            Image(
                R.drawable.zombs,
                "ZOMBS",
                "Crosshair Color  ->  Green\n" +
                        "Outlines  ->  On\n" +
                        "Center Dot  ->  Off\n" +
                        "\n"+
                        "Inner Line Opacity  ->  1\n" +
                        "Inner Line Length  ->  5\n" +
                        "Inner Line Thickness  ->  2\n" +
                        "Inner Line Offset  ->  2\n" +
                        "\n"+
                        "Outer Line Opacity  ->  0\n" +
                        "Outer Line Length  ->  0\n" +
                        "Outer Line Thickness  ->  0\n" +
                        "Outer Line Offset  ->  0\n" +
                        "\n"+
                        "Movement Error  ->  On\n" +
                        "Firing Error  ->  On"
            ),
            Image(
                R.drawable.scream,
                "SCREAM",
                "Crosshair Color  ->  Green\n" +
                        "Outlines  ->  On\n" +
                        "Center Dot  ->  Off\n" +
                        "\n"+
                        "Inner Line Opacity  ->  1\n" +
                        "Inner Line Length  ->  5\n" +
                        "Inner Line Thickness  ->  2\n" +
                        "Inner Line Offset  ->  2\n" +
                        "\n"+
                        "Outer Line Opacity  ->  0\n" +
                        "Outer Line Length  ->  0\n" +
                        "Outer Line Thickness  ->  0\n" +
                        "Outer Line Offset  ->  0\n" +
                        "\n"+
                        "Movement Error  ->  On\n" +
                        "Firing Error  ->  On"
            ),



        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
