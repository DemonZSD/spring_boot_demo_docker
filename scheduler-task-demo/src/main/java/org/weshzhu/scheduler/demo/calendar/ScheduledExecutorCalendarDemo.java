package org.weshzhu.scheduler.demo.calendar;

import java.util.Calendar;
import java.util.TimerTask;

/**
 * 设置每星期二的 16:38:10 执行任务。使用 Calendar 间接实现该功能。
 * @author weshzhu
 */
public class ScheduledExecutorCalendarDemo extends TimerTask {

    private String jobName;

    public ScheduledExecutorCalendarDemo(String jobName) {
        super();
        this.jobName = jobName;
    }

    /**
     * 计算从当前时间currentDate开始，满足条件dayOfWeek, hourOfDay,
     * minuteOfHour, secondOfMinite的最近时间
     * @param currentDate  当前时间
     * @param dayOfWeek  参与计算的星期
     * @param hourOfDay 参与计算的 小时时间
     * @param minuteOfHour 参与计算的分钟时间
     * @param secondOfMinute 参与计算的秒时间
     * @return 返回下次执行任务的时间
     */
    public Calendar getEarliestDate(Calendar currentDate, int dayOfWeek, int hourOfDay, int minuteOfHour, int secondOfMinute){
        int currentWeekOfYear = currentDate.get(Calendar.WEEK_OF_YEAR);
        int currentDayOfYear = currentDate.get(Calendar.DAY_OF_YEAR);
        int currentHour = currentDate.get(Calendar.HOUR_OF_DAY);
        int currentMinute = currentDate.get(Calendar.MINUTE);
        int currentSecond = currentDate.get(Calendar.SECOND);
        // 如果dayOfWeek 小于当前currentWeekOfYear, 则推迟一周
        boolean weekDelay = false;
        if(currentWeekOfYear > dayOfWeek){
            weekDelay = true;
        }else if(currentWeekOfYear == dayOfWeek){
            //当输入条件与当前日期的dayOfWeek相等时，如果输入条件中的
            //hourOfDay小于当前日期的
            //currentHour，则WEEK_OF_YEAR需要推迟一周
            if(hourOfDay < currentHour){
                weekDelay = true;
            }else if(hourOfDay == currentHour){
                // 如果要求的分钟小于 当前的分钟，说明时间已经过了，需要推迟下周
                if(minuteOfHour < currentMinute){
                    weekDelay = true;
                }else if(minuteOfHour == currentMinute){
                    // 如果要求的秒小于 当前的分钟，说明时间已经过了，需要推迟下周
                    if(secondOfMinute < currentMinute){
                        weekDelay = true;
                    }
                }

            }
        }
        if(weekDelay){
            //设置当前日期中的WEEK_OF_YEAR为当前周推迟一周
            currentDate.set(Calendar.WEEK_OF_YEAR, currentWeekOfYear + 1);
        }
        // 设置当前日期中的DAY_OF_WEEK,HOUR_OF_DAY,MINUTE,SECOND为输入条件中的值。
        currentDate.set(Calendar.DAY_OF_WEEK, dayOfWeek);
        currentDate.set(Calendar.HOUR_OF_DAY, hourOfDay);
        currentDate.set(Calendar.MINUTE, minuteOfHour);
        currentDate.set(Calendar.SECOND, secondOfMinute);
        return currentDate;
    }



    @Override
    public void run() {

    }
}
