package me.lake.librestreaming.sample.ui;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

public class AlwaysMarqueeTextView extends AppCompatTextView {
  
    // com.duopin.app.AlwaysMaguequeScrollView  
    public AlwaysMarqueeTextView(Context context) {
  
        super(context);  
  
        // TODO Auto-generated constructor stub  
    }  
  

    @Override  
    public boolean isFocused() {  
  
        return true;  
  
    }  
  

}  