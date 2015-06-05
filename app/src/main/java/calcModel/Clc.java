package calcModel;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Fernando on 2015-06-05.
 * Originally created as part of: PartialTab
 * You will love this code and be awed by it's magnificence
 */
public class Clc {
    private Context ctx;

    public String cBackgroundImage;

// Display
    public int cDisplayColor;
    public int cDisplayTextColor;
    public int cDisplayTextSize;

// Basic Buttons
    public int cBasicBtnsColor;
    public int cBasicBtnsTextColor;
    public int cBasicBtnsTextSize;
    public int cBasicBtnsMargines;
    public int cBasicBtnsPadding;

// Memories
    public int cMemW;  // for the scrollable
    public int cMemH;  // for each button
    public int cMemColor;
    public int cMemMargins;
    public int cMemPaddings;
    public int cMemTextSize;
    public int cMemTextColor;

    // Aqui: More pg. 2

    public List<uLayout> uLayoutS;


    public void populateUserStuff(LinearLayout topLvlLL){

        for (uLayout layout : uLayoutS) {

            //uLayout tLL = new uLayout(ctx);

            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0);
            lp.weight = 1;
            layout.setLayoutParams(lp);
            layout.setOrientation(LinearLayout.HORIZONTAL);
            //tLL.setLayoutParams(lp);
            //tLL.setOrientation(LinearLayout.HORIZONTAL);

            //Aqui: Substitute objValues
            //uLayoutS.add(tLL);
            topLvlLL.addView(layout);

            for (uBtn userBtn : layout.uBtnS) {
                //Button b = new Button(ctx);
                userBtn.setText(userBtn.ubText);
//                b.setWidth(94);
                //b.setPadding(10, -20, -10, 20);
                //b.setTextSize(30);
                LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
                p.weight = 1;

                //p.setMargins(30,30,30,30);
//                p.setMargins(-3,-5,-3,-5);


                userBtn.setLayoutParams(p);

                userBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Button bt = (Button)v;
                        String buttonText = bt.getText().toString();

                        Toast.makeText(ctx, buttonText, Toast.LENGTH_LONG).show();
                    }
                });

            }

        }


    }


    public Clc(Context c){
        ctx = c;
    }



}
