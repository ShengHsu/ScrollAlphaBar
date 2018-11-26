# ScrollAlphaBar
Listen scroll to change actionbar's alpha.

![image](https://github.com/ShengHsu/ScrollAlphaBar/blob/master/demo.gif)


1. implements NestedScrollView.onScrollChanged
2. mChangeControll = new ChangeControll(getSupportActionBar());
3. mChangeControll.ChangeAlphaInScroll(scrollView.getScrollY());  in onScrollChanged

Default Value:
1. Default_Background_Color = "#FF0000"
2. Default_Text_Color_First = "#555555"
3. Default_Text_Color_Second = "#FFFFFF"
