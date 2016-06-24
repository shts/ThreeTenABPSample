package jp.shts.android.sample.threetenabpsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.threeten.bp.Duration;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalAdjusters;
import org.threeten.bp.temporal.TemporalField;

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

 http://docs.oracle.com/javase/8/docs/api/
 http://builder.japan.zdnet.com/sp_oracle/weblogic/35067620/2/

 [日本人のためのDate and Time API Tips]
 http://www.coppermine.jp/docs/programming/2013/12/jsr310-tips.html

 [JavaDoc]
 http://docs.oracle.com/javase/8/docs/api/

 [必修！ Date and Time API──Java SE 8の新日時APIの基本を学ぶ]
 http://builder.japan.zdnet.com/sp_oracle/weblogic/35067620/

 [今日から始めるJava8]
 http://acro-engineer.hatenablog.com/entries/2013/02/06

 [Androidで使える日付処理系のライブラリーを試してみた]
 http://qiita.com/futabooo/items/206b71ee8022ac685ece

 [日付操作(JSR-310 Date and Time API)]
 http://terasolunaorg.github.io/guideline/5.1.0.RELEASE/ja/ArchitectureInDetail/Utilities/DateAndTime.html#overview

 [旧日時APIとの相互変換＆Java 6／7でDate-Time APIが使えるライブラリThreeTen Backport (1/3)]
 http://www.atmarkit.co.jp/ait/articles/1504/02/news144.html

 [Java 8日時APIの主なメソッドとフォーマット用のパターン文字の使い方 (1/6)]
 http://www.atmarkit.co.jp/ait/articles/1501/29/news016.html

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
            Log.d(TAG, "========================= LocalDate Test =========================");

            // 今日の日付を取得する
            LocalDate todayDate = LocalDate.now();
            Log.d(TAG, "todayDate: " + todayDate);

            // 今日の日付の年(Year)を取得する
            int year = todayDate.getYear();
            Log.d(TAG, "todayDate: year " + year);
            // 今日の日付の月(Month)を取得する
            int monthValue = todayDate.getMonthValue();
            Log.d(TAG, "todayDate: monthValue " + monthValue);
            // 今日の日付の日(Day)を取得する
            int dayOfMonth = todayDate.getDayOfMonth();
            Log.d(TAG, "todayDate: dayOfMonth " + dayOfMonth);
            // 今日の日付の週(Week)を取得する
            String dayOfWeek = todayDate.getDayOfWeek().toString();
            Log.d(TAG, "todayDate: dayOfWeek " + dayOfWeek);

            // 表示を切り替えてみる
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
            String formatted = todayDate.format(formatter);
            Log.d(TAG, "formatted: " + formatted);

            // 1年前の日付を取得する
            LocalDate oneYearBefore = todayDate.minusYears(1L);
            Log.d(TAG, "oneYearBefore: " + oneYearBefore);
            // 1年後の日付を取得する
            LocalDate oneYearAfter = todayDate.plusYears(1L);
            Log.d(TAG, "oneYearAfter: " + oneYearAfter);

            // 1か月前の日付を取得する
            LocalDate oneMonthBefore = todayDate.minusMonths(1L);
            Log.d(TAG, "oneMonthBefore: " + oneMonthBefore);
            // 1か月後の日付を取得する
            LocalDate oneMonthAfter = todayDate.plusMonths(1L);
            Log.d(TAG, "oneMonthAfter: " + oneMonthAfter);

            // 1週間前の日付を取得する
            LocalDate oneWeekBefore = todayDate.minusWeeks(1L);
            Log.d(TAG, "oneWeekBefore: " + oneWeekBefore);
            // 1週間後の日付を取得する
            LocalDate oneWeekAfter = todayDate.plusWeeks(1L);
            Log.d(TAG, "oneWeekAfter: " + oneWeekAfter);

            // 1日前の日付を取得する
            LocalDate oneDayBefore = todayDate.minusDays(1L);
            Log.d(TAG, "oneDayBefore: " + oneDayBefore);
            // 1日後の日付を取得する
            LocalDate oneDayAfter = todayDate.plusDays(1L);
            Log.d(TAG, "oneDayAfter: " + oneDayAfter);

            // 現在の年の1月1日(ツイタチ)の日付を取得する
            LocalDate withDayOfYear = todayDate.withDayOfYear(1);
            Log.d(TAG, "withDayOfYear: " + withDayOfYear);
            // 現在の月の1日(ツイタチ)の日付を取得する
            LocalDate withDayOfMonth = todayDate.withDayOfMonth(1);
            Log.d(TAG, "withDayOfMonth: " + withDayOfMonth);
        }

        /**
         * 時刻に関わる LocalTime
         */
        {
            Log.d(TAG, "========================= LocalTime Test =========================");

            // 現在の時刻を取得する
            LocalTime localTime = LocalTime.now();
            Log.d(TAG, "localTime: " + localTime);

            // 現在の時刻から時(Hour)を取得する
            int hour = localTime.getHour();
            Log.d(TAG, "localTime: hour " + hour);
            // 現在の時刻から分(Minutes)を取得する
            int minute = localTime.getMinute();
            Log.d(TAG, "localTime: minute " + minute);
            // 現在の時刻から秒(Second)を取得する
            int second = localTime.getSecond();
            Log.d(TAG, "localTime: second " + second);
            // 現在の時刻からナノ秒(Nano)を取得する
            int nano = localTime.getNano();
            Log.d(TAG, "localTime: nano " + nano);

            // 表示を切り替える
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH時mm分ss.SSS秒");
            String formatted = localTime.format(formatter);
            Log.d(TAG, "formatted: " + formatted);

            // 1時間前の時刻を取得する
            LocalTime oneHourBefore = localTime.minusHours(1L);
            Log.d(TAG, "oneHourBefore: " + oneHourBefore);
            // 1時間前の時刻を取得する
            LocalTime oneHourAfter = localTime.plusHours(1L);
            Log.d(TAG, "oneHourAfter: " + oneHourAfter);

            // 1分前の時刻を取得する
            LocalTime oneMinutesBefore = localTime.minusMinutes(1L);
            Log.d(TAG, "oneMinutesBefore: " + oneMinutesBefore);
            // 1分後の時刻を取得する
            LocalTime oneMinutesAfter = localTime.plusMinutes(1L);
            Log.d(TAG, "oneMinutesAfter: " + oneMinutesAfter);

            // 1秒前の時刻を取得する
            LocalTime oneSecondsBefore = localTime.minusSeconds(1L);
            Log.d(TAG, "oneSecondsBefore: " + oneSecondsBefore);
            // 1秒後の時刻を取得する
            LocalTime oneSecondsAfter = localTime.plusSeconds(1L);
            Log.d(TAG, "oneSecondsAfter: " + oneSecondsAfter);

            // 1ナノ秒後の時刻を取得する
            LocalTime oneNanosBefore = localTime.minusNanos(1L);
            Log.d(TAG, "oneNanosBefore: " + oneNanosBefore);
            // 1ナノ後の時刻を取得する
            LocalTime oneNanosAfter = localTime.plusNanos(1L);
            Log.d(TAG, "oneNanosAfter: " + oneNanosAfter);
        }

        /**
         * 日付と時刻に関わる LocalDateTime
         */
        {
            Log.d(TAG, "========================= LocalDateTime Test =========================");

            // 現在の日付と時刻を取得する
            LocalDateTime localDateTime = LocalDateTime.now();
            Log.d(TAG, "localDateTime: " + localDateTime);

            // 1年と1時間前の日付と時刻を取得する
            LocalDateTime oneYearAndHourBefore = localDateTime.minusYears(1L).minusHours(1L);
            Log.d(TAG, "oneYearAndHourBefore: " + oneYearAndHourBefore);
            // 1年と1時間後の日付と時刻を取得する
            LocalDateTime oneYearAndHourAfter = localDateTime.plusYears(1L).plusHours(1L);
            Log.d(TAG, "oneYearAndHourAfter: " + oneYearAndHourAfter);
        }

        /**
         * 日付と時刻に関わる ZonedDateTime
         */
        {
            Log.d(TAG, "========================= ZonedDateTime Test =========================");

            // 現在の日付と時刻を取得する
            ZonedDateTime zonedDateTime = ZonedDateTime.now();
            Log.d(TAG, "zonedDateTime: " + zonedDateTime);

            // 指定した時刻が今から何日(何時間、何分)前かを取得する
            ZonedDateTime from = ZonedDateTime.parse("2016-06-23T15:07:24+09:00");
            ZonedDateTime to = ZonedDateTime.now();
            Duration duration = Duration.between(from, to);

            if (0 < duration.toDays()) {
                Log.d(TAG, "duration: " + duration.toDays() + " days");
            } else if (duration.toMinutes() < 60/*分*/) {
                Log.d(TAG, "duration: " + duration.toMinutes() + " minutes");
            } else if (duration.toHours() < 24/*時間*/) {
                Log.d(TAG, "duration: " + duration.toHours() + " hours");
            }

            // TODO: 後で書く...
        }
    }
}
