# ScrollAlphaBar
Listen scroll to change actionbar's alpha.


1. implements NestedScrollView.onScrollChanged
2. mChangeControll = new ChangeControll(getSupportActionBar());
3. mChangeControll.ChangeAlphaInScroll(scrollView.getScrollY());  in onScrollChanged
