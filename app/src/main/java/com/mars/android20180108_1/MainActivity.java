package com.mars.android20180108_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
//AutoCompleteTextView 應用
public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        String str [] = {"cca","aac","aag","bbbd","ddc"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                MainActivity.this, android.R.layout.simple_list_item_1, str);
        act.setThreshold(1);//設定幾個字相同 1代表1個字相同
        act.setAdapter(adapter);//放入adapter
    }

}

/*       HashMap介紹 key-->value
     HashMap m1 = new HashMap();
      m1.put("name","Mars");
      m1.put("chi", 95);
      System.out.println(m1.get("name"));

      HashMap m2 = new HashMap();
      m2.put("name","Marry");
      m2.put("chi", 95);
      System.out.println(m2.get("name"));

      //ArrayList放入HashMap
      ArrayList<HashMap>  str = new ArrayList<>();
      str.add(m1);
      str.add(m2);
      for (HashMap m : str)
        {
            System.out.println(m.get("name"));
        }
 */
