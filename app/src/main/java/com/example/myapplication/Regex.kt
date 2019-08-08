package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_regex.*

class Regex : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regex)

        checkbox.setOnClickListener {
            var intent = Intent(this, CheckBox::class.java)
            startActivity(intent)
        }

        seekbar.setOnClickListener {
            var intent = Intent(this, SeekBar::class.java)
            startActivity(intent)
        }

        radiobutton.setOnClickListener {
            var intent = Intent(this, Radio_Button::class.java)
            startActivity(intent)
        }

        the_switch.setOnClickListener {
            if(the_switch.isChecked){
                Toast.makeText(this, "the switch is checked.", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "the switch is not checked.", Toast.LENGTH_LONG).show()
            }
        }

        var text = "This is a question we get from time to time. There are instances when you’re given an assignment, not by word count, but assigned by the number of pages. For example, “Write a paper four pages long.” If you get an assignment to write four pages, one of the first questions that will likely come to mind is, “How many words are in four pages?” If you need to figure out words per page, you can use a words per page calculator.\n" +
                "The truth is there is no definitive answer to this question. The number of words it will take to fill a page will depend on a number of factors including the type of font used, the font size, spacing elements, the margins used on the paper, the paragraph length, etc. For example, if the assignment says the writing should be in 10-point font, it’s going to take a greater number of words to fill a page than if the assignment requires a 12-point font.\n" +
                "\n" +
                "For those who need a general rule of thumb, a typical page which has 1-inch margins and is typed in 12 point font with standard spacing elements will be approximately 500 words when typed single spaced. For assignments that require double spacing, it would take approximately 250 words to fill the page. For an assignment that requires you to write four pages, you can make the estimation that you’ll need to write approximately 2000 words for a single spaced paper, or 1000 words if the assignment is double spaced. Again, the type of font used can make the word count higher or lower, but it’s a good rule of thumb for those who are simply looking for a general estimation.\n" +
                "\n" +
                "Since there can be a large variation on the number of words needed to fill a page, most papers are no longer assigned by page count. They are instead assigned by word count. That is, an assignment, essay or paper will likely be assigned as 1500 – 2000 words rather than 3 – 4 pages. This way it is much more difficult for the writer to “game the system” by using large fonts and excessive spacing to meet the writing criteria.\n" +
                "\n" +
                "If you are given a writing assignment with a page number, the best thing to do is go directly to the person who made the assignment and ask for a word count. This will take away all the variations and help ensure your writing assignment meets expectations. If it’s for something informal and you simply need a general guideline, you can find it below."

        textScroll.text = text.toString()
    }
}
