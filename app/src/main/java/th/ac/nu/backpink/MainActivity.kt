package th.ac.nu.backpink

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubmit.setOnClickListener {
            var countMusic = (editCountMusic.text.toString()).toIntOrNull()
            var education = chooseEducation.getSelectedItem().toString()
            var hobby = chooseHobby.getSelectedItem().toString()
            var career = chooseCareer.getSelectedItem().toString()
            var category = chooseCategory.getSelectedItem().toString()
            var friend = (editFriend.text.toString()).toIntOrNull()
            var round = (editRound.text.toString()).toIntOrNull()
            var age = (editAge.text.toString()).toIntOrNull()
            var meetY = (editMeetY.text.toString()).toIntOrNull()
            var meetM = (editMeetM.text.toString()).toIntOrNull()
            if(meetM==null){meetM = 0}
            if(meetY==null){meetY = 0}else{meetY = meetY*12}
            
            var meet = meetY+meetM
            if(meet!=null){
                meet = meet*12
            }
            var favorite:Int? = null
            if(radioHigh.isChecked){
                favorite = 2
            }
            if(radioMe.isChecked){
                favorite = 1
            }
            if(radioLow.isChecked){
                favorite = 0
            }
            if(countMusic != null && countMusic<=0){
                if(education == "ปริญญาตรี"){
                    if(friend != null && friend<=0){
                        openJisooIntent()
                    }else if(friend != null && friend > 0){
                        openNoIntent()
                    }
                }else if(education == "มัธยมศึกษา"){
                    openRisaIntent()
                }else if(education == "ประถมศึกษา"){
                    openNoIntent()
                }else if(education == "อนุปริญญา"){
                    openNoIntent()
                }else if(education == "ปริญญาเอก"){
                    openNoIntent()
                }else if(education == "ปริญญาเอก"){
                    openNoIntent()
                }
            }else if(countMusic != null && countMusic>0){
                if(round!=null && round <=0){
                    if(age!=null && age<=17){
                        openNoIntent()
                    }else if(age!=null && age>17){
                        if(meet!=null && meet<=4){
                            openNoIntent()
                        }else if(meet!=null && meet>4){
                            openRisaIntent()
                        }

                    }
                }else if(round!=null && round >0){
                    if(education == "ปริญญาตรี"){
                        if(hobby == "เล่นเกมส์"){
                            if(favorite!= null && favorite<=0){
                                if(radioGirl.isChecked){
                                    openNoIntent()
                                }else if(radioBoy.isChecked){
                                    openJisooIntent()
                                }
                            }else if(favorite!= null && favorite>0){
                                if(friend!=null && friend <=1){
                                    openJisooIntent()
                                }else if(friend!=null && friend >1){
                                    openRisaIntent()
                                }
                            }
                        }else if(hobby == "ฟังเพลง"){
                            if(round!=null && round<=13){
                                if(career=="พนักงานบริษัท"){
                                    if(meet!=null && meet<=10){
                                        openRoseIntent()
                                    }else if(meet!=null && meet>10){
                                        if(round!=null && round<=1){
                                            openRisaIntent()
                                        }else if(round!=null && round>1){
                                            openJennieIntent()
                                        }
                                    }
                                }else if(career == "นักเรียน"){
                                    if(age!=null && age<=20){
                                        if(countMusic!=null && countMusic<=8){
                                            if(round!= null && round<=2){
                                                openRisaIntent()
                                            }else if(round!=null && round>2){
                                                openJennieIntent()
                                            }
                                        }else if(countMusic!=null && countMusic>8){
                                            if(round!= null && round<=7){
                                                openRoseIntent()
                                            }else if(round!=null && round>7){
                                                openRisaIntent()
                                            }
                                        }
                                    }else if(age!=null && age>20){
                                        if(category == "ลูกทุ่ง"){
                                            openRisaIntent()
                                        }else if(category == "EDM"){
                                            openRisaIntent()
                                        }else if(category == "เพื่อชีวิต"){
                                            openRisaIntent()
                                        }else if(category == "อื่นๆ"){
                                            openRisaIntent()
                                        }else if(category == "Pop"){
                                            if(favorite!=null && favorite<=1){
                                                openRisaIntent()
                                            }else if(favorite!=null && favorite>1){
                                                if(meet!=null && meet<=18){
                                                    openRoseIntent()
                                                }else if(meet!=null && meet>18){
                                                    openJennieIntent()
                                                }
                                            }
                                        }else if(category == "R&B"){
                                            openRisaIntent()
                                        }else if(category == "Rap & Hip-hop"){
                                            openRisaIntent()
                                        }else if(category == "Rock"){
                                            openRisaIntent()
                                        }
                                    }
                                }else if(career== "ช้าราชการ"){
                                    openJisooIntent()
                                }else if(career == "อื่นๆ"){
                                    openNoIntent()
                                }else if(career == "ธุรกิจส่วนตัว"){
                                    if(friend!=null && friend<=4){
                                        openRisaIntent()
                                    }else if(friend!=null && friend>4){
                                        openJisooIntent()
                                    }
                                }
                            }else if(round!=null && round>13){
                                openJisooIntent()
                            }
                        }else if(hobby == "ดูภาพยนตร์"){
                            if(radioGirl.isChecked){
                                if(round!=null && round<=6){
                                    if(round!=null && round<=3){
                                        if(age!=null && age<=19){
                                            openJisooIntent()
                                        }else if(age!=null && age>19){
                                            if(meet!=null && meet<=18){
                                                openRisaIntent()
                                            }else if(meet!=null && meet>18){
                                                if(age!=null && age<=21){
                                                    if(age!=null && age<=20){
                                                        openRoseIntent()
                                                    }else if(age!=null && age>20){
                                                        openRisaIntent()
                                                    }
                                                }
                                            }
                                        }
                                    }else if(round!=null && round>3){
                                        openJennieIntent()
                                    }
                                }else if(round!=null && round>6){
                                    if(friend!=null && friend<=2){
                                        openNoIntent()
                                    }else if(friend!=null && friend>2){
                                        openRisaIntent()
                                    }
                                }
                            }else if(radioBoy.isChecked){
                                openRoseIntent()
                            }
                        }else if(hobby=="เล่นดนตรี"){
                            openRisaIntent()
                        }else if(hobby == "อื่นๆ"){
                            if(category=="ลูกทุ่ง"){
                                openRoseIntent()
                            }else if(category=="EDM"){
                                openRoseIntent()
                            }else if(category=="เพื่อชีวิต"){
                                openRoseIntent()
                            }else if(category=="อื่นๆ"){
                                openRoseIntent()
                            }else if(category=="Pop"){
                                openRoseIntent()
                            }else if(category=="R&B"){
                                openRisaIntent()
                            }else if(category=="Rap & Hip-hop"){
                                openRoseIntent()
                            }else if(category=="Rock"){
                                openRoseIntent()
                            }
                        }else if(hobby=="ออกกำลังกาย"){
                            if(meet!=null && meet<=24){
                                openRisaIntent()
                            }else if(meet!=null && meet >24){
                                openJennieIntent()
                            }
                        }else if(hobby=="วาดรูป"){
                            if(category=="ลูกทุ่ง"){
                                openJisooIntent()
                            }else if(category=="EDM"){
                                openJisooIntent()
                            }else if(category=="เพื่อชีวิต"){
                                openJisooIntent()
                            }else if(category=="อื่นๆ"){
                                openJisooIntent()
                            }else if(category=="Pop"){
                                if(age!=null && age<=20){
                                    openRoseIntent()
                                }else if(age!=null && age>20){
                                    openJisooIntent()
                                }
                            }else if(category=="R&B"){
                                openJisooIntent()
                            }else if(category=="Rap & Hip-hop"){
                                openRisaIntent()
                            }else if(category=="Rock"){
                                openJisooIntent()
                            }
                        }else if(hobby=="ทำอาหาร"){
                            openJennieIntent()
                        }
                    }else if(education=="มัธยมศึกษา"){
                        if(radioGirl.isChecked){
                            if(friend!=null && friend<=7){
                                if(countMusic!=null&&countMusic<=13){
                                    openRisaIntent()
                                }else if(countMusic!=null && countMusic>13){
                                    openJisooIntent()
                                }
                            }
                        }else if(radioBoy.isChecked){
                            openJisooIntent()
                        }
                    }else if(education=="ประถมศึกษา"){
                        openRisaIntent()
                    }else if(education=="อนุปริญญา"){
                        openRisaIntent()
                    }else if(education=="ปริญญาเอก"){
                        openRoseIntent()
                    }else if(education=="ปริญญาโท"){
                        openJennieIntent()
                    }
                }
            }



        }
    }
    fun openJisooIntent(){
        val intent = Intent(this,JisooActivity::class.java)
        startActivity(intent)
    }
    fun openJennieIntent(){
        val intent = Intent(this,JennieActivity::class.java)
        startActivity(intent)
    }
    fun openRoseIntent(){
        val intent = Intent(this,RoseActivity::class.java)
        startActivity(intent)
    }
    fun openRisaIntent(){
        val intent = Intent(this,RisaActivity::class.java)
        startActivity(intent)
    }
    fun openNoIntent(){
        val intent = Intent(this,NoActivity::class.java)
        startActivity(intent)
    }
}
