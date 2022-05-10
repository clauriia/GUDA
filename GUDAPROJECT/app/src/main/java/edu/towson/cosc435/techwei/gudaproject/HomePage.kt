package edu.towson.cosc435.techwei.gudaproject

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class HomePage : AppCompatActivity() {
    //private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var drawerlayout: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var actionbar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_selection_page)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        /** Hamburger drawer navigation bar **/
        drawerlayout = findViewById(R.id.drawer_layout)
        toggle = ActionBarDrawerToggle(this, drawerlayout, R.string.open, R.string.close)

        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()

        //actionBar!!.setDisplayHomeAsUpEnabled(true)
        //actionbar.setDisplayHomeAsUpEnabled(true);
        //actionBar.displayOptions =
        //android.app.ActionBar.DISPLAY_HOME_AS_UP //or ActionBar.DISPLAY_SHOW_HOME or ActionBar.DISPLAY_HOME_AS_UP


        /**Image slide show**/
        val imageSlider = findViewById<ImageSlider>(R.id.slider)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.chiefs))
        imageList.add(SlideModel(R.drawable.bamenda1))
        imageList.add(SlideModel(R.drawable.dress))
        imageList.add(SlideModel(R.drawable.chiefs2))

        imageSlider.setImageList(imageList)

    }


    /**Function to be able to select the hamburger drawer menu and get a response **/
    /** override fun onOptionsItemSelected(item: MenuItem): Boolean {
    if(toggle.onOptionsItemSelected(item)){
    return true
    }
    return super.onOptionsItemSelected(item)
    }**/

    override fun onBackPressed() {
        if (drawerlayout.isDrawerOpen(GravityCompat.START)) {
            drawerlayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            /**R.id.subItem1 -> {
                val intent = Intent(this, AllocationPage::class.java)
                this.startActivity(intent)
                true
            }**/
            R.id.subItem2 -> {
                val intent = Intent(this, QuartersActivity::class.java)
                this.startActivity(intent)
                true
            }
            /**R.id.subItem3 -> {
                val intent = Intent(this, CurrencyConverter::class.java)
                this.startActivity(intent)
                true
            }**/
            /**R.id.nav_learn -> {
                val intent = Intent(this, TipsActivity::class.java)
                this.startActivity(intent)
                true
            }**/
            /**R.id.nav_folklore -> {
                val intent = Intent(this, SettingsActivity::class.java)
                this.startActivity(intent)
                true
            }**/
            //R.id.nav_ads -> {
                //val intent = Intent(this, MainActivity::class.java)
                //this.startActivity(intent)
                //true
            //}
            else -> super.onOptionsItemSelected(item)
        }
    }
}