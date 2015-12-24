# CustomIndicators
![](https://raw.githubusercontent.com/marten83/CustomIndicators/master/preview.jpg)

Custom indicator for daimajias AndroidImageSlider. Shows numbers as the image shows instead of dotts.

## Usage
Add CustomIndicators.java to your project

Place this in your XML where you want the indicators to show

```xml
<LinearLayout
	android:id="@+id/custom_indicator"
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"/>
```

Add this tho your album slider

```java
albumSlider.setIndicatorVisibility(PagerIndicator.IndicatorVisibility.Invisible); //Hide deafault indicators
albumSlider.addOnPageChangeListener(new CustomIndicators(this, null, {TOTAL SIZE}));
```