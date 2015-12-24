public class CustomIndicators extends LinearLayout implements ViewPagerEx.OnPageChangeListener {

    View v;
    TextView tag;
    Integer totlaImageCount;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public CustomIndicators(Context context, AttributeSet attrs, int totalCount) {
        super(context, attrs, totalCount);
        totlaImageCount = totalCount;
        LinearLayout customIndicators = (LinearLayout) ((Activity)context).findViewById(R.id.custom_indicator);
        v = LayoutInflater.from(context).inflate(R.layout.custom_indicator, this, false);
        GradientDrawable shape =  new GradientDrawable();
        shape.setCornerRadius(12);
        RelativeLayout tagBox = (RelativeLayout) v.findViewById(R.id.customTag);
        shape.setColor(context.getResources().getColor(R.color.transparent_black));
        tagBox.setBackground(shape);
        tag = (TextView) v.findViewById(R.id.Tag);
        customIndicators.addView(v);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {
        if(tag != null) {
            Integer currentPage = position+1;
            String textTag = currentPage + "/" + totlaImageCount;
            tag.setText(textTag);
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {}

}
