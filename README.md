# Extended Scroll View

A simple android scrollview which lets you detect when it gets to the bottom of the screen.

### Installation
Gradle: 
```sh
dependencies {
    compile 'com.eltropy:extendedscrollview-v3:1.0.0'
}
```
### Tutorial

Add to XML: 
```sh
 <com.eltropy.extendedscrollview.ExtendedScrollView
        android:id="@+id/scrollview"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        
</com.eltropy.extendedscrollview.ExtendedScrollView>
```

Use in any class:

```sh
ExtendedScrollView extendedScrollView = (ExtendedScrollView) findViewById(R.id.scrollview);
extendedScrollView.setOnBottomReachedListener(new ExtendedScrollView.OnBottomReachedListener() {
            @Override
            public void onBottomReached() {
                //Do Stuff
            }
        });
```



