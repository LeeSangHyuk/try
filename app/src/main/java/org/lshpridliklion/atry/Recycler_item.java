package org.lshpridliklion.atry;

import android.os.Bundle;

/**
 * Created by hyuk on 2017-03-31.
 */

public class Recycler_item {
    int image;
    String title;

    int getImage(){
        return this.image;
    }
    String getTitle(){
        return this.title;
    }

    Recycler_item(int image, String title){
        this.image=image;
        this.title=title;
    }


}
