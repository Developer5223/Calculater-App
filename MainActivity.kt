package com.example.first_practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


     minus.setOnClickListener ({

         button1.setOnClickListener(
             {
                 var firstval: Int = first.text.toString().toInt()
                // firstval=firstval.toInt()
                 var secondval: Int = second.text.toString().toInt()

                 var anws: Int = firstval-secondval
               //  ans.text="answer  :  "+anws
                 button1.text="answer  :  "+anws

     }

         )


     }
     )

        plus.setOnClickListener ({

            button1.setOnClickListener(
                {
                    var firstval: Int = first.text.toString().toInt()
                    // firstval=firstval.toInt()
                    var secondval: Int = second.text.toString().toInt()

                    var anws: Int = firstval+secondval
                   // ans.text="answer  :  "+anws
                    button1.text="answer  :  "+anws
                }
            )


        }
        )

        div.setOnClickListener ({

            button1.setOnClickListener(
                {
                    var firstval: Int = first.text.toString().toInt()
                    // firstval=firstval.toInt()
                    var secondval: Int = second.text.toString().toInt()

                    var anws: Int = firstval/secondval
                  //  ans.text="answer  :  "+anws
                    button1.text="answer  :  "+anws
                }
            )


        })


        mul.setOnClickListener ({

            button1.setOnClickListener(
                {
                    var firstval: Int = first.text.toString().toInt()
                    // firstval=firstval.toInt()
                    var secondval: Int = second.text.toString().toInt()

                    var anws: Int = firstval*secondval
                  //  ans.text="Answer m :  "+anws
                    button1.text="answer  :  "+anws
                }
            )


        })


    }
}
