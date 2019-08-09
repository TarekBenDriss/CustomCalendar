# CustomCalendar



Custom Calendar is an Android library to show a beautiful user-friendly custom calendar

  - Colors the picked date
  - Colors the perido between two dates
  - Get picked dates details

### Installation

Dillinger requires [Node.js](https://nodejs.org/) v4+ to run.

Install the dependencies and devDependencies and start the server.

```sh
maven { url "http://dl.bintray.com/tarekbendriss/AndroidCustomCalendar"}
```

2. Go to project app Gradle file and under dependencies , add
```sh
implementation 'com.bendriss.customcalendar:app:1.0.11@aar'
```
At the time of writing, the latest version of this library is '1.0.11'.
3. Sync the project Gradle files.
##### Layouts

In your layout, if you want to add a single calendar just add:
```sh
<com.bendriss.customcalendar.CustomCalendar
        android:id="@+id/singleCalendar"
        custom:layout_constraintStart_toStartOf="parent"
        custom:layout_constraintEnd_toEndOf="parent"
        custom:layout_constraintTop_toTopOf="parent"
        custom:layout_constraintBottom_toBottomOf="parent"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
```
If you want to add a double calendar to color the periode between two days, just add:
```sh
<com.bendriss.customcalendar.DoubleCustomCalendar
        android:id="@+id/doubleCalendar"
        android:visibility="invisible"
        custom:layout_constraintStart_toStartOf="parent"
        custom:layout_constraintEnd_toEndOf="parent"
        custom:layout_constraintTop_toTopOf="parent"
        custom:layout_constraintBottom_toBottomOf="parent"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
```


##### Development

To guarantee that your app runs correctly, you need to add in your activity:
```sh
private CustomCalendar singleCalendar;
private DoubleCustomCalendar doubleCalendar;
```
Find your calendars:
```sh
singleCalendar = findViewById(R.id.calendar1);
doubleCalendar = findViewById(R.id.
```
And set the current activity:
```sh
singleCalendar.setActivity(this);
doubleCalendar.setActivity(this);
```
#### Get details from the calendar
For the single calendar, you can get the day, month, year and the date as a string:
```sh
// to get the selected day
singleCalendar.getDay();

// to get the selected month
singleCalendar.getMonth();

// to get the selected year
singleCalendar.getYear();

// to get the selected date as a string
singleCalendar.getDateAsString();
```
For the double calendar, you can get the start day, start month, start year, the start date as a string, the end day, end month, end year and the end date as a string:
```sh
// to get the selected start day
singleCalendar.getStartDay();

// to get the selected start month
singleCalendar.getStartMonth();

// to get the selected start year
singleCalendar.getStartYear();

// to get the selected start date as a string
singleCalendar.getStartYear();

// to get the selected end day
singleCalendar.getEndDay();

// to get the selected end month
singleCalendar.getEndMonth();

// to get the selected end year
singleCalendar.getEndYear();

// to get the selected end date as a string
singleCalendar.getEndYear();

```

#### Latest versions

To get latest version, see [binTray](https://bintray.com/tarekbendriss/AndroidCustomCalendar/CustomCalendar)



