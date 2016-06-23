package jp.shts.android.sample.threetenabpsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.LocalTime;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoUnit;

import java.util.Locale;

/**
 *
 ThreeTenABP

 https://github.com/JakeWharton/ThreeTenABP

 http://qiita.com/sis-yoshiday/items/c26e56a6010971c6d9ae
 https://tech.recruit-mp.co.jp/mobile/kyobashidex_1/
 http://qiita.com/futabooo/items/206b71ee8022ac685ece
 http://acro-engineer.hatenablog.com/entry/20130213/1360691391

 https://gist.github.com/tokuhirom/0b7441684653cb85cefa

 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 日付に関わる LocalDate
         */
        {
            // 今日の日付を取得する
            LocalDate localDate = LocalDate.now();
            Log.d(TAG, "localDate: " + localDate);

            // 表示を切り替えてみる
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
            String formatted = localDate.format(formatter);
            Log.d(TAG, "formatted: " + formatted);

            // 1年前の日付を取得してみる
            LocalDate oneYearBefore = localDate.minusYears(1L);
            Log.d(TAG, "oneYearBefore: " + oneYearBefore);
            // 1年後の日付を取得してみる
            LocalDate oneYearAfter = localDate.plusYears(1L);
            Log.d(TAG, "oneYearAfter: " + oneYearAfter);

            // 1か月前の日付を取得してみる
            LocalDate oneMonthBefore = localDate.minusMonths(1L);
            Log.d(TAG, "oneMonthBefore: " + oneMonthBefore);
            // 1か月後の日付を取得してみる
            LocalDate oneMonthAfter = localDate.plusMonths(1L);
            Log.d(TAG, "oneMonthAfter: " + oneMonthAfter);

            // 1週間前の日付を取得してみる
            LocalDate oneWeekBefore = localDate.minusWeeks(1L);
            Log.d(TAG, "oneWeekBefore: " + oneWeekBefore);
            // 1週間後の日付を取得してみる
            LocalDate oneWeekAfter = localDate.plusWeeks(1L);
            Log.d(TAG, "oneWeekAfter: " + oneWeekAfter);

            // 1日前の日付を取得してみる
            LocalDate oneDayBefore = localDate.minusDays(1L);
            Log.d(TAG, "oneDayBefore: " + oneDayBefore);
            // 1日後の日付を取得してみる
            LocalDate oneDayAfter = localDate.plusDays(1L);
            Log.d(TAG, "oneDayAfter: " + oneDayAfter);
        }

        //
        {
            // 現在の時刻を取得する
            LocalTime localTime = LocalTime.now();
            Log.d(TAG, "localTime: " + localTime);
        }

//        LocalDateTime ldt = LocalDateTime.now();
//        int ld = ldt.getDayOfMonth();
//        int lm = ldt.getMonthValue();
//        int ly = ldt.getYear();
//        Log.d(TAG,"3ten : "+ldt.toString());
//        Log.d(TAG,"3ten : [day: "+ld+"] [month: "+lm+"] [year: "+ly+"]");
//        Log.d(TAG,"3ten : [day: "+ldt.getDayOfWeek().name()+"] [month: "+ldt.getMonth().name()+"] [year: "+ldt.getYear()+"]");
//        ldt.withYear(2000);
//        ldt.plusHours(2);
//        Log.d(TAG,"3ten : " +ldt.toString());
//        String frenchShortName = ldt.getMonth().getDisplayName(TextStyle.SHORT, Locale.FRENCH);
//        boolean isLeapYear = false; // could not find a matching function
//        LocalDateTime rounded = ldt.truncatedTo(ChronoUnit.DAYS);
//        Log.d(TAG,"3ten : [french Short: "+frenchShortName+"] [leapyear: "+isLeapYear+"] [rounded: "+rounded+"]");
//        ldt = LocalDateTime.of(2005, 3, 26, 12, 0, 0, 0);
//        Log.d(TAG,"3ten : "+ ldt.toString());
//        LocalDateTime plusPeriod = ldt.plusDays(1);
//        Log.d(TAG,"3ten : +1day: "+ plusPeriod.toString());
//        LocalDateTime plusDuration = ldt.plus(24, ChronoUnit.HOURS);
//        Log.d(TAG,"3ten : +24h : "+ plusDuration.toString());
//        LocalDateTime today = LocalDateTime.now();
//        LocalDateTime yesterday = today.minusDays(1);
//        org.threeten.bp.Duration diff = org.threeten.bp.Duration.between(today,yesterday);
//        Log.d(TAG,"3ten : hours between "+ diff.toHours());
    }
}
