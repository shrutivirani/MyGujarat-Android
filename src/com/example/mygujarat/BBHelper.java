package com.example.mygujarat;

import java.io.ByteArrayOutputStream;

import android.R.drawable;
import android.R.string;
import android.os.Bundle;

import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;

public class BBHelper extends  SQLiteOpenHelper{
	
	static int DBVERSON = 1;
	static String DATABASENAME = "Stu.db";
	public static Resources dd;
	
	//String TABLENAME = "Student";
	
	//String STUDENTID = "ID";
	//String FIRSTNAME = "FirstName";
	//String LASTNAME = "LastName";
	//String MOBILENO = "MobileNo";	
	

	public BBHelper(Context context, String name, CursorFactory factory,int version) {
		
		super(context, DATABASENAME, factory, DBVERSON);
		
	}
	
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		
	//	String _query = "CREATE TABLE " + TABLENAME + " ( " + STUDENTID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + FIRSTNAME + " TEXT, " + LASTNAME  + " TEXT, " + MOBILENO  + " TEXT)";
		//               CREATE TABLE Student (ID INTEGER PRIMARY KEY AUTOINCREMENT, FirstName TEXT, LastName TEXT, MobileNo TEXT);
		
		db.execSQL("CREATE TABLE City (ID	INTEGER,C_ID	INTEGER ,City_Name	TEXT,Name	TEXT,Distance	TEXT,Info	TEXT,InfoG	TEXT,pc INTEGER);");
	
		
		//"Ahmedabad"	
		db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (1,1,'Ahmedabad','Hutheesing Jain Temple','23.004019,72.549551','The temple is made up of white marble. It was built in 1848 A.D by a rich merchant Sheth Hutheesing as a dedication to the 15th Jain tirthankar, Shri Dharmanatha. The construction was supervised and completed by his wife Shethani Harkunvar. The temple architect was Premchand Salat. It is a worth seeing place. It is a intricately carved building.','આ મંદિર સફેદ આરસપહાણમાંથી બનેલી છે. તે 15 મી જૈન તીર્થંકર શ્રી Dharmanatha સમર્પણ તરીકે સમૃદ્ધ વેપારી શેઠ Hutheesing દ્વારા 1848 એડી માં બાંધવામાં આવી હતી. આ બાંધકામ પર દેખરેખ રાખી અને તેની પત્ની Shethani Harkunvar દ્વારા પૂર્ણ કરવામાં આવી હતી. આ મંદિર આર્કિટેક્ટ પ્રેમચંદ સલાત હતી. તે વર્થ જોઈ સ્થળ છે. તે ગૂંચવણભરી રીતે કોતરવામાં ઇમારત છે.',"+ R.drawable.a_a_a +");");
		db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (1,2,'Ahmedabad','Jumma Masjid','23.023675,72.587055','Jama Masjid (literally Friday Mosque), also known as Jami or Jumma Mosque, is the most splendid mosque of Ahmedabad, built in 1424 during the reign of Ahmed Shah I. Lying in the old walled city, the mosque is situated outside Bhadra Fort area, along the south side of the road extending from Teen Darwaza to Manek Chowk.','પણ જામી અથવા જુમ્મા મસ્જિદ તરીકે ઓળખાય જામા મસ્ઝિદ (શાબ્દિક શુક્રવારે મસ્જિદ), જૂના કોટ શહેરમાં આવતું અહમદ શાહ આઇ ના શાસન દરમિયાન 1424 માં બાંધવામાં અમદાવાદ સૌથી ભવ્ય મસ્જિદ છે, મસ્જિદ ભદ્ર ફોર્ટ વિસ્તાર બહાર આવેલું છે ટીન દરવાજા થી માણેક ચોક સુધી વિસ્તરે રસ્તાના દક્ષિણ બાજુએ આવેલા.',"+ R.drawable.a_b_a +");");
    	db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (1,3,'Ahmedabad','kankaria lake','23.005707,72.601187','Kankaria Lake is the biggest lake in Ahmedabad in the state of Gujarat, India. It is located in the southern part of the city, in the Maninagar area. A lakefront has been developed around it, which has many public attractions such as a zoo, toy train, kids city, tethered balloon ride, water rides, water park, food stalls, and entertainment facilities. The lakefront was revamped in 2008. Kankaria Carnival is a week-long festival held here in the last week of December. Many cultural, art, and social activities are organised during the carnival.','કાંકરિયા લેક ગુજરાત, ભારત રાજ્યના અમદાવાદ સૌથી મોટી તળાવ છે. તે મણીનગર વિસ્તાર, શહેરના દક્ષિણ ભાગમાં આવેલું છે. એક lakefront આવા એક પ્રાણી સંગ્રહાલય, ટોય ટ્રેન, બાળકો શહેર, tethered બલૂન રાઇડ, પાણી સવારી, વોટર પાર્ક, ખોરાક બહાર આવવા, અને મનોરંજન સુવિધાઓ ઘણા જાહેર આકર્ષણો ધરાવે છે, જે તેને આસપાસ વિકસાવવામાં આવ્યો છે. આ lakefront 2008 કાંકરિયા કાર્નિવલ અપાયું ડિસેમ્બરના છેલ્લા સપ્તાહમાં અહીં યોજાયેલી એક સપ્તાહ લાંબા તહેવાર છે. ઘણા સાંસ્કૃતિક, કળા અને સામાજિક પ્રવૃત્તિઓ કાર્નિવલ દરમિયાન યોજવામાં આવે છે.',"+ R.drawable.a_c_a +");");
		db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (1,4,'Ahmedabad','Law Garden','23.026277,72.561425','This is a public garden. It has a famous market outside it. If you have a good bargaining power than this is a place for you. This market offers traditional colourful cloths. It also offers good food options, it has good food stalls. It is best seen at evening.','પણ જામી અથવા જુમ્મા મસ્જિદ તરીકે ઓળખાય જામા મસ્ઝિદ (શાબ્દિક શુક્રવારે મસ્જિદ), જૂના કોટ શહેરમાં આવતું અહમદ શાહ આઇ ના શાસન દરમિયાન 1424 માં બાંધવામાં અમદાવાદ સૌથી ભવ્ય મસ્જિદ છે, મસ્જિદ ભદ્ર ફોર્ટ વિસ્તાર બહાર આવેલું છે ટીન દરવાજા થી માણેક ચોક સુધી વિસ્તરે રસ્તાના દક્ષિણ બાજુએ આવેલા.',"+ R.drawable.a_d_a +");");
		db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (1,5,'Ahmedabad','Manek Chowk','23.022489,72.586712','Manek Chowk is a prominent city square in Old Ahmedabad, India. It is surrounded by historical structures. It is a vegetable market in the morning, a bullion market in the noon and the street food market at night.','માણેક ચોક ઓલ્ડ અમદાવાદ, ભારત એક અગ્રણી શહેર ચોરસ છે. તે ઐતિહાસિક માળખાં દ્વારા ઘેરાયેલું છે. તે સવારે એક વનસ્પતિ બજારમાં બપોર અને રાત્રે સ્ટ્રીટ ફૂડ બજારમાં એક બુલિયન બજાર છે.',"+ R.drawable.a_e_a +");");
		db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (1,6,'Ahmedabad','Sabarmati Ashram','23.062603,72.585189','Sabarmati Ashram (also known as Gandhi Ashram, Harijan Ashram, or Satyagraha Ashram) is located in the Sabarmati suburb of Ahmedabad, Gujarat, adjoining the Ashram Road, on the banks of the River Sabarmati, four miles from the town hall. This was one of the residences of Mohandas Karamchand Gandhi, generally called Mahatma Gandhi, who lived there for about twelve years along with his wife, Kasturba Gandhi. It was from his base here that Gandhi led the Dandi march also known as the Salt Satyagraha on 12 March 1930. In recognition of the significant influence that this march had on the Indian independence movement the Indian government has established the ashram as a national monument.','(પણ ગાંધી આશ્રમ, હરિજન આશ્રમ, અથવા સત્યાગ્રહ આશ્રમ તરીકે ઓળખાય છે) સાબરમતી આશ્રમ નદી સાબરમતી નદીના કિનારા પર, ચાર માઇલ ટાઉન હોલ માંથી, આશ્રમ રોડ આસપાસના, અમદાવાદ, ગુજરાત સાબરમતી ઉપનગર માં સ્થિત થયેલ છે. આ તેની પત્ની કસ્તુરબા ગાંધી સાથે લગભગ બાર વર્ષ માટે ત્યાં રહેતા સામાન્ય મહાત્મા ગાંધી કહેવાય મોહનદાસ કરમચંદ ગાંધી, રહેઠાણો એક હતું. તે ગાંધી પણ આ માર્ચ ભારત સરકાર રાષ્ટ્રીય સ્મારક તરીકે આશ્રમ સ્થાપના કરી છે જે ભારતીય સ્વતંત્રતાની ચળવળ પર હતી કે નોંધપાત્ર પ્રભાવ માન્યતા માર્ચ 1930 12 સોલ્ટ Satyagraha તરીકે ઓળખાય દાંડી કૂચ કે અહીં તેના આધાર હતો.',"+ R.drawable.a_f_a+");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (1,7,'Ahmedabad','Sidi Saiyyed jali','23.026934,72.581041','The Sidi Saiyyed Mosque, built in 1573, is one of the most famous mosques of Ahmedabad. As attested by the marble tablet fixed on the wall of the mosque, it was built by Sidi Saeed or Sidi Saiyyed, an Abyssinian in the retinue of Bilal Jhajar Khan, general in the army of the last Sultan Shams-ud-Din Muzaffar Shah III of the Gujarat Sultanate.','1573 માં બાંધવામાં સિદિ Saiyyed મસ્જિદ, અમદાવાદ સૌથી પ્રસિદ્ધ મસ્જિદો પૈકીની એક છે. મસ્જિદ ના દિવાલ પર સુધારેલ આરસ ટેબ્લેટ દ્વારા પ્રમાણિત છે, તે છેલ્લા સુલતાન Shams-ઉદ-દિન મુઝફ્ફર શાહ III ના આર્મી સામાન્ય સિદી સઇદ અથવા સિદી Saiyyed, બિલાલ Jhajar ખાન રસાલો એક એબિસિનિયા, દ્વારા બાંધવામાં આવ્યું હતું ગુજરાત સલ્તનતના.',"+ R.drawable.a_g_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (1,8,'Ahmedabad','Vastrapur Lake','23.038433,72.528516','Vastrapur Lake is situated in western part of Ahmedabad. It is officially named after Narsinh Mehta. The lake was beautified by the AMC after 2002 and has since become a popular spot in the city.','વસ્ત્રાપુર લેક અમદાવાદ પશ્ચિમ ભાગમાં આવેલું છે. તે સત્તાવાર નરસિંહ મેહતા બાદ નામ આપવામાં આવ્યું છે. આ તળાવ 2002 પછી એએમસી દ્વારા સુશોભિત કરવામાં આવી અને ત્યારથી શહેરમાં એક લોકપ્રિય સ્થળ બની ગયું છે.',"+ R.drawable.a_h_a +");");
	  //Amreli
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (2,1,'Amreli','Nagnath Temple','21.603283,71.215847','Nagnath is a very well known temple of Amreli Constructed by Late Diwan of Amreli. The architecture of the temple is mesmerised you when you see the temple.','નાગનાથ અમરેલી લેટ દિવાન દ્વારા નિર્માણ અમરેલી એક ખૂબ જ જાણીતા મંદિર છે. તમે મંદિર જુઓ ત્યારે મંદિરના સ્થાપત્ય તમે mesmerized છે.',"+ R.drawable.b_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (2,2,'Amreli','Port pipavav','20.923889,71.506217','It is Indias first private port and third largest container terminal operator, occupying an area of 6760 sq. km. The port has three dry cargo berths and one LPG / liquid cargo berth. The three cargo berths have a length of about 725 m, which are equipped with instruments capable of handling multipurpose cargo.','તે 6760 ચો. કિમી વિસ્તાર પર કબજો, ભારતનો પ્રથમ ખાનગી પોર્ટ અને ત્રીજા સૌથી મોટા કન્ટેનર ટર્મિનલ ઓપરેટર છે. પોર્ટ ત્રણ શુષ્ક કાર્ગો બર્થ અને એક એલપીજી / પ્રવાહી કાર્ગો બર્થ ધરાવે છે. ત્રણ કાર્ગો બર્થ બહુહેતુક કાર્ગો હેન્ડલિંગ સક્ષમ સાધનો સાથે સજ્જ છે કે જેના વિશે 725 મીટર લંબાઇ ધરાવે છે.',"+ R.drawable.b_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (2,3,'Amreli','Ramji mandir','21.580738,71.126878','Ramji Mandir, Amreli is one of the first things that comes to the mind of many people, while discussing Amreli. Its true that there are quite a few other interesting things to see and do too. However, like all other attractions, the Ramji Mandir in Amreli also has its own brand of unique charm. In fact, countless visitors just cant stop gushing about the place. In short, rest assure that a trip to Ramji Mandir Amreli will leave you with a lifetime of fond memories.','',"+ R.drawable.b_c_a +");");
	    
	    //Anand
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (3,1,'Aanand','Amul dairy','22.551316,72.971963','The Amul Dairy Cooperative Museum is a major sightseeing destination of Anand. The prime building of the Dairy Museum, surrounded by a water body is built with red stones. The pathway to the gallery is admired with a number of photographs depicting the gradual evolution of the museum into the advanced industry of today. The Dairy Museum also has an Auditorium, equipped with 100 seats, where movies on the history and evolution of the milk movement of India are projected. The major contribution of building the milk industry of Amul Dairy goes to Dr. Varghese Kurien. Nearly Five hundred thousand milk producers of the Kaira District Cooperative Milk Producers Union, have a major influence in the operation of this Dairy Museum, which is considered one of the biggest co-operative movements of the world.','અમૂલ ડેરી સહકારી મ્યુઝિયમ આનંદ એક મુખ્ય જોવાલાયક સ્થળોનો પ્રવાસ સ્થળ છે. પાણી શરીર દ્વારા ઘેરાયેલા ડેરી મ્યુઝિયમ મુખ્ય મકાન, લાલ પથ્થરો સાથે બનેલ છે. ગેલેરીમાં માર્ગ આજે અદ્યતન ઉદ્યોગ માં મ્યુઝિયમ ઓફ ધીમે ધીમે ઉત્ક્રાંતિ દર્શાવતી તસવીરો એક નંબર સાથે પ્રશંસા છે. ડેરી મ્યુઝિયમ પણ ઇતિહાસ અને ભારતની દૂધ ચળવળ ઉત્ક્રાંતિ પર ફિલ્મો અંદાજ કરવામાં આવે છે જ્યાં 100 બેઠકો સાથે સજ્જ એક સભાગૃહ છે. અમૂલ ડેરી દૂધ ઉદ્યોગ મકાન મુખ્ય ફાળો ડૉ વર્ગીસ કુરિયન જાય છે. આ ખેડા જિલ્લા સહકારી દૂધ ઉત્પાદક યુનિયન લગભગ પાંચસો હજાર દૂધ ઉત્પાદકો, વિશ્વના સૌથી મોટા સહકારી હલનચલન એક ગણવામાં આવે છે કે જે આ ડેરી મ્યુઝિયમ ઓફ ઓપરેશન મોટો પ્રભાવ છે.',"+ R.drawable.c_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (3,2,'Aanand','Ranchhodrai Temple','22.553658, 72.952765','The main complex of the shrine, encircled by a fort wall, is located near the bank of sacred Gomti River beside the main  of Dakor. The temple features 8 domes and 24 turrets and the central dome of a height of 27 m. The temple is also admired with a white flag and a Kalash. The architecture of the temple displays Maharashtrian style. The temple was constructed in 1772 A.D. and it houses an image of Ranchhodrai, (a name of Lord Krishna) in black touchstone, featuring a height of a metre.','એક કિલ્લો દિવાલ દ્વારા ઘેરાયેલો મંદિર મુખ્ય જટિલ, ડાકોર ના mainMARKET બાજુના પવિત્ર ગોમતી નદીના બેંક નજીક સ્થિત થયેલ છે. આ મંદિર 8 ડોમ અને 24 બાંધકામને અને 27 મીટર એક ઊંચાઇ ના કેન્દ્રીય ગુંબજ લક્ષણો છે. આ મંદિર પણ એક સફેદ ધ્વજ અને કળશ સાથે પ્રશંસા છે. મંદિરના સ્થાપત્ય મહારાષ્ટ્રીયન શૈલી દર્શાવે છે. આ મંદિર 1772 એડી માં બાંધકામ કરવામાં આવ્યું હતું અને તે એક મીટર ની ઊંચાઈ દર્શાવતા, બ્લેક ટચસ્ટોન માં Ranchhodrai એક છબી, (ભગવાન કૃષ્ણનું એક નામ) ધરાવે છે. મૂર્તિ સિંહાસન ચાંદી અને સોનું સાથે પ્લેટેડ woodcarving એક કામ છે. આ મૂર્તિ પોતે પણ રત્ન અને ગોલ્ડ સાથે આવરી લેવામાં આવે છે. સંગીત પ્રવેશ દ્વાર ઉપર માળ પર ગોઠવાયેલા tokorkhana થી ડ્રમ્સ અને shehnai પર ત્રણ કલાક માટે રમાય છે. Champavatiben Tambekar પ્રભાવ રહેતા સાંભળી મંદિર ભક્તો માટે ખૂબ જ લોકપ્રિય પ્રવૃત્તિ છે.',"+ R.drawable.c_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (3,3,'Aanand','Sri Sri Radha Giridhari','22.549714,72.922552','Good ambiance. Good and pleasing attire of shri krishna and radha all the days at the temple. Shringar also excellent.','',"+ R.drawable.c_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (3,4,'Aanand','Swaminarayan Mandir','22.553394,72.954390','The six storey temple of Swaminarayan is a popular attraction of tourists visiting Anand. The idols are Harikrishna Maharaj and Narayan Lakshmi located in the 1st shrine,  Guruparampara placed in the 2nd shrine, Guru Parampara in the 3rd shrine, Shri Akshar Purushottam Maharaj in the 4th shrine and Lord Ghanshyam Maharaj in the 5th shrine.','સ્વામિનારાયણ છ માળનું મંદિર આનંદ મુલાકાત લઈ પ્રવાસીઓ એક લોકપ્રિય આકર્ષણ છે. આ મૂર્તિઓ હરિકૃષ્ણ મહારાજ અને 1 લી મંદિર સ્થિત નારાયણ લક્ષ્મી, Guruparampara 2 મંદિર માં મૂકવામાં આવે છે, 5 મંદિર માં 3 જી મંદિર માં ગુરુ પરંપરા, 4 થી મંદિર માં શ્રી અક્ષર પુરુષોત્તમ મહારાજ અને ભગવાન ઘનશ્યામ મહારાજ.',"+ R.drawable.c_d_a +");");
	
	//Banaskatha
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (4,1,'Banaskatha','Ambaji mandir','24.088851,72.390951',' named for the location of the temple in the Arasur hills, near the source of the Saraswati river at the south-western end of the Aravali mountain range. The red flag above the small temple dances welcomingly in the wind. Made of white marble with gold cones, the temple was originally built by Nagar Brahmins. There is a main entrance in the front and only a small side-door, because it is believed that Mataji (another name for Ambaji) has forbidden the addition of any other door. The temple is surrounded by an open square called chachar chowk where ceremonial sacrifices called havans are performed.','આ Aravali પર્વતમાળા દક્ષિણ-પશ્ચિમ છેડે સરસ્વતી નદીના સ્રોત નજીક Arasur ટેકરીઓ મંદિર સ્થાન નામ આપ્યું હતું. નાના મંદિર ઉપર લાલ ધ્વજ પવન માં welcomingly નાચે છે. સોનું cones સાથે સફેદ આરસપહાણમાંથી બનાવેલી, મંદિર મૂળ નગર બ્રાહ્મણો દ્વારા બાંધવામાં આવ્યું હતું. તે માતાજી (અંબાજી માટે અન્ય નામ) અન્ય કોઇ બારણું વધુમાં પ્રતિબંધ ફરમાવવામાં આવ્યો છે એવું માનવામાં આવે છે કારણ કે સામે એક મુખ્ય પ્રવેશદ્વાર અને માત્ર એક નાની બાજુ દરવાજા હોય છે. આ મંદિર havans કહેવાય ઔપચારિક બલિદાન કરવામાં આવે છે જ્યાં એક ઓપન ચોરસ કહેવાય chachar ચોક દ્વારા ઘેરાયેલું છે.',"+ R.drawable.d_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (4,2,'Banaskatha','Balaram Mahadev Temple','24.270655,72.508848','The sacred temple of Balram Mahadev is situated about 12 kms from in Banaskantha district. The palaces of the Nawab and Hindu Temples are also worth seeing. The palace is in a neo-Classical Baroque style, with arcades and classical columns. It has now been taken over by a private entrepreneur, and opened as a resort. The huge gardens, their contours clearly defined, have been landscaped to blend exotic plants, bridges and ramps for easy access into the original Nawabi design. ','બલરામ મહાદેવનું પવિત્ર મંદિર બનાસકાંઠા જિલ્લામાં લગભગ 12 કિ.મી. આવેલું છે. નવાબ અને હિન્દૂ મંદિરો મહેલો પણ જોવા જેવો છે. આ મહેલ આર્કેડ અને શાસ્ત્રીય કૉલમ સાથે, નવશાસ્ત્રીય બેરોક શૈલી છે. તે હવે એક ખાનગી ઉદ્યોગસાહસિક દ્વારા લેવામાં, અને એક ઉપાય તરીકે ખોલવામાં આવી છે. વિશાળ બગીચાઓ, સ્પષ્ટ રીતે વ્યાખ્યાયિત તેમના રૂપરેખા, મૂળ નવાબી ડિઝાઇન માં સરળ ઍક્સેસ માટે વિદેશી છોડ, પુલો અને વેચાણમાં વધારો મિશ્રણ દેખાવ કરવામાં આવી છે.',"+ R.drawable.d_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (4,3,'Banaskatha','Koteshwar Ambaji','24.088851,72.390951','Koteshwar is eight kilometers from Ambaji and it is believed to be the source, or gomukh, of one of the present-day Saraswati rivers. Valmiki Ashram and Shakti Ashram are worth seeing here.','કોટેશ્વર અંબાજીથી આઠ કિલોમીટર છે અને તે હાજર દિવસ સરસ્વતી નદીઓ એક સ્ત્રોત, અથવા gomukh, હોવાનું માનવામાં આવે છે. વાલ્મિકી આશ્રમ અને શક્તિ આશ્રમ અહીં જોવા જેવો છે.',"+ R.drawable.d_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (4,4,'Banaskatha','Mangalya Van Ambaji','24.328143,72.859460','Nestled atop a hillock i.e. Kailash tekri around a kilometer and half from the Ambaji Temple on the Khedbrahma Highway is Mangalya Van, a unique garden that is of late drawing hordes of tourists. One has to climb steps to reach Kailash tekri and Mangalya Van, which is also surrounded by water bodies. The van was developed by the forest department and its USP is a unique Rashi Van (astrological garden) within and a garden of plants, which astrologers say have the same effect as stones on ones life.','માંગલ્ય વેન, પ્રવાસીઓ અંતમાં ચિત્ર ચઢાઇઓ છે કે એક અનન્ય બગીચો ખેડબ્રહ્મા હાઇવે પર અંબાજી મંદિર માંથી કિલોમીટર અને અડધા આસપાસ એટલે કે કૈલાશ ટેકરી એક ટેકરી માથે છે જેવી. એક કૈલાશ ટેકરી અને પણ પાણી સંસ્થાઓ દ્વારા ઘેરાયેલું છે, જે માંગલ્ય વેન સુધી પહોંચવા માટે પગલાંઓ ચઢી છે. વાન વન વિભાગ દ્વારા વિકસાવવામાં આવી હતી અને તેની યુએસપી અંદર એક અનન્ય રાશિ વેન (જ્યોતિષીય બગીચો) અને જ્યોતિષીઓ એક જીવન પર પત્થરો તરીકે જ અસર હોય છે જે છોડ, એક બગીચો છે.',"+ R.drawable.d_d_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (4,5,'Banaskatha','Sardarkrushinagar Dantiwada Agricultural University','24.322821,72.316234','Sardarkrushinagar Dantiwada Agricultural University was founded as one of the prestigious State Agricultural Universities in India. It is approximately 30 km  from Palanpur in the Banaskantha District of Gujarat.','Sardarkrushinagar દાંતીવાડા કૃષિ યુનિવર્સિટી ભારતમાં પ્રતિષ્ઠિત રાજ્ય કૃષિ યુનિવર્સિટીઓ એક તરીકે સ્થાપના કરવામાં આવી હતી. ગુજરાત ના બનાસકાંઠા જિલ્લાના પાલનપુર લગભગ 30 કિમી દૂર છે.',"+ R.drawable.d_e_a +");");
	    
	    //bharuch
	    
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (5,1,'Bharuch','Gayatri Mata Temple','21.715754,73.040752','Very Very good place for evening hang out. The environment surrounding is very peaceful and natural. Benches located in front of river narmada is good attraction for taking rest. Very pleasant place.','સાંજે માટે ખૂબ જ ખૂબ જ સારી જગ્યાએ હેંગ આઉટ. આજુબાજુનું વાતાવરણ ખૂબ જ શાંત અને કુદરતી છે. નર્મદા નદી આગળ સ્થિત થયેલ બેન્ચ વિસામો લેવા માટે સારી આકર્ષણ છે. ખૂબ જ સુખદ સ્થળ.',"+ R.drawable.e_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (5,2,'Bharuch','Golden bridge','21.695121,73.003993','Narmada Bridge is one of the longest bridge in Gujarat. Its a balanced cantilever type bridge connecting link between Ankleshwar to Bharuch. It was built in 1881 by the British, who needed a bridge across the Narmada River to create better access to trade and administration officials in Bombay (now called Mumbai).The Bridge is also called Narmada Bridge. ','નર્મદા બ્રિજ ગુજરાતમાં સૌથી લાંબો પુલ છે. તે ભરૂચ માટે અંકલેશ્વર વચ્ચે કડી જોડાઈ સંતુલિત બાહુધરણ પ્રકાર પુલ છે. તે .આ બ્રિજ પણ નર્મદા બ્રિજ કહેવામાં આવે છે (હવે મુંબઇ કહેવાય છે) બોમ્બે વેપાર અને વહીવટ અધિકારીઓ સારી વપરાશ બનાવવા માટે નર્મદા નદી પર પુલ જરૂરી જે બ્રિટિશરો દ્વારા 1881 માં બાંધવામાં આવી હતી.',"+ R.drawable.e_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (5,3,'Bharuch','Nilkantheshwar','21.719639,73.045297','Neelkanth Mahadev Temple  is a Hindu temple dedicated to Nilkanth.    The temple is situated at a height of 1330 meters and is located about 32 km from Rishikesh. The temple is one of the most revered holy shrines dedicated to Lord Shiva and is a prominent Hindu pilgrimage site. It is surrounded by dense forests and is adjacent to the mountain ranges of Nar-Narayan. It is enveloped between the valleys of Manikoot, Brahmakoot and Vishnukoot and is located at the confluence of the rivers Pankaja and Madhumati.','નીલકંઠ મહાદેવ મંદિર નીલકંઠ માટે સમર્પિત એક હિન્દૂ મંદિર છે. આ મંદિર 1330 મીટરની ઊંચાઇ પર આવેલું છે અને ઋષિકેશની થી લગભગ 32 કિમી સ્થિત થયેલ છે. આ મંદિર ભગવાન શિવને સમર્પિત સૌથી આદરણીય પવિત્ર મંદિર છે અને એક અગ્રણી હિન્દૂ યાત્રા ધામ છે. તે ગાઢ જંગલો દ્વારા ઘેરાયેલા અને નાર-નારાયણ પર્વત રેન્જ અડીને છે. તે Manikoot, Brahmakoot અને Vishnukoot ની ખીણો વચ્ચે છવાયેલું છે અને નદીઓ પંકજા અને મધુમતી સંગમ પર સ્થિત છે.',"+ R.drawable.e_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (5,4,'Bharuch','Swaminarayan Temple','21.725445,73.031298','This temple is located on N H No. 8, at Bharuch. It is relatively new. Temple is magnificent, built by BAPS Trust. The temple surroundings are well maintained and one can spend an entire evening in an enjoyable manner.','આ મંદિર ભરૂચ ખાતે, એન એચ નં 8 પર સ્થિત થયેલ છે. તે પ્રમાણમાં નવા છે. મંદિર બીએપીએસ ટ્રસ્ટ દ્વારા બનેલ છે, ભવ્ય છે. આ મંદિર આસપાસના સારી રીતે જાળવવામાં આવે છે અને એક આનંદપ્રદ રીતે સમગ્ર સાંજે પસાર કરી શકે છે.',"+ R.drawable.e_d_a +");");
	    
	    //dahod
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (6,1,'Dahod','Chhab Talav','22.837109,74.250857','Chhab Talav with its illuminating waters has emerged as a good tourist destination. Many families come to this lake and spend some time in tranquillity. Food stalls with different variety of eateries fills up your hungry belly.','તેના પ્રકાશથી અજવાળતા પાણીમાં સાથે Chhab તળાવ એક સારો પ્રવાસી સ્થળ તરીકે ઉભરી આવ્યું છે. ઘણા કુટુંબો આ તળાવ આવે છે અને સુલેહ કેટલાક સમય વિતાવે છે. ખાણીપીણી અલગ વિવિધતા સાથે ફૂડ દુકાનો તમારા ભૂખ્યા પેટ ભરે.',"+ R.drawable.f_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (6,2,'Dahod','Dahod fair','22.825253, 74.264086',' Right in the heart of the city of Dahod, every week the Dahod fair is hosted. On every Wednesday it is held. Mainly the residents of Dahod come here to visit the fair. Items related to the traditions and customs of Gujarat are bought by the tourists. The prices of the items found here are quite low. The small hawkers sell different items like handicrafts, plastic wares and household items. These hawkers mainly come from the tribal region located nearby. Different types of herbs, fruits are also available.','અધિકાર દાહોદ શહેરના હૃદય, દર અઠવાડિયે દાહોદ ફેર યજમાન થયેલ છે. દર બુધવારે તે રાખવામાં આવે છે. મુખ્યત્વે દાહોદ ના રહેવાસીઓ વાજબી મુલાકાત માટે અહીં આવે છે. પરંપરાઓ અને ગુજરાત રિવાજો સંબંધિત વસ્તુઓ પ્રવાસીઓ દ્વારા ખરીદી કરવામાં આવે છે. અહીં મળી વસ્તુઓ ભાવ તદ્દન ઓછી છે. નાના hawkers હસ્તકલા, પ્લાસ્ટિક વાસણો અને ઘરની વસ્તુઓ જેવા વિવિધ વસ્તુઓ વેચાણ કરે છે. આ hawkers મુખ્યત્વે નજીકના સ્થિત આદિવાસી વિસ્તારમાં આવે છે. ઔષધો વિવિધ પ્રકારના ફળો પણ ઉપલબ્ધ છે.',"+ R.drawable.f_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (6,3,'Dahod','Kali Dam Shiv Temple','22.903391,74.244989','The Archaeological Survey of India (ASI) has finally decided to restore the 12th-century Shiv temple in Bavka, an interior village in Dahod district. About 14 km from Dahod, the Bavka temple, according to locals, was constructed by a devdasi (a temple dancer) in a single night. and tribal jewelry made up of a mixture of silver and lead are sold by the tribal people.','ભારતીય પુરાતત્ત્વ સર્વેક્ષણ (ASI) છેલ્લે Bavka 12 મી સદીના શિવ મંદિર, દાહોદ જિલ્લામાં એક આંતરિક ગામ પુનઃસ્થાપિત કરવાનો નિર્ણય લીધો છે. દાહોદ, આ Bavka મંદિરથી 14 કિમી, સ્થાનિક અનુસાર, એક રાત્રે એક devdasi (એક મંદિર નૃત્યાંગના) દ્વારા બાંધવામાં આવ્યો હતો.',"+ R.drawable.f_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (6,4,'Dahod','Aurangzeb Fort','22.826127,74.253632','Aurangzeb fort, the fort with glorious majesticity was constructed to mark the birth of the great Emperor Aurangzeb here. This fort was constructed in the 16th century as a resting place for guests and voyagers. The rulers used to offer their daily prayers to god Allah in the masjid located inside the fort.','ઔરંગઝેબ કિલ્લો, ભવ્ય majesticity ફોર્ટ અહીં મહાન સમ્રાટ ઔરંગઝેબના જન્મ માર્ક બાંધવામાં આવ્યો હતો. આ કિલ્લાની મહેમાનો અને વોયેજરો માટે વિશ્રામી સ્થળ તરીકે 16 મી સદીમાં બાંધવામાં આવ્યો હતો. શાસકો કિલ્લાની અંદર સ્થિત મસ્જિદ ભગવાન અલ્લાહ તેમના દૈનિક પ્રાર્થના કરવા માટે વપરાય છે.',"+ R.drawable.f_d_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (6,5,'Dahod','Najmi Masjid','22.832689,74.256235','This is the biggest and the loftiest mosque of the Dawoodi Bohra sect. This masjid was launched by Dr. Syedna Mohammed Burhanuddin Saheb in the year 2002.','આ સૌથી મોટી અને દાઉદી વોહરા સંપ્રદાય ના loftiest મસ્જિદ છે. આ મસ્જિદ વર્ષ 2002 માં ડો Syedna મોહમ્મદ Burhanuddin સાહેબ દ્વારા શરૂ કરવામાં આવી હતી.',"+ R.drawable.f_e_a +");");
		  
	    //dangs
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (7,1,'Dangs','Girmal Waterfall','20.972470, 73.721319','This waterfall is bigger than Gira. It is open to the public, and accessible by jeeps for hire.','આ ધોધ ગીરા કરતાં મોટી છે. તેને ભાડે માટે જીપોનું દ્વારા જાહેર જનતા માટે ખુલ્લા છે, અને સુલભ છે. 3 મહેલ ઇકો કેમ્પસાઇટ મહાલ ઇકો કેમ્પસાઇટ ઉત્કૃષ્ટ વૉકિંગ અને ટ્રેકિંગ વિકલ્પો સાથે, નદીઓ અને વાંસ ઉડાનોની સાથે bestowed છે. તે પૂર્ણા વન્યજીવન અભયારણ્ય ના મધ્યમાં, પૂર્ણા નદી ની બેન્કો પર સ્થિત થયેલ છે અને ડાંગ જંગલ વિભાગ ઉત્તર એક ભાગ છે. તે પૂર્ણા અને ગીરા નદીઓ સાથે સ્વૈચ્છિક એક વિશાળ અને સમૃદ્ધ વન દ્વારા ઘેરાય છે.',"+ R.drawable.g_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (7,2,'Dangs','Mahal Eco campsite','20.915461, 73.668648','Mahal is a village located 28 km from Ahwa on the Ahwa-Songadh road on the boundary of the Purna Sanctuary and has the thickest bamboo forest cover inGujarat. A forest rest house is built on promontory jutting out over the Purna river on the Ahwa-Songadh main road. Facilities at the rest house include three rooms with attached bath and toilet, an interpretation centre, a projected roof top sitting arrangement looking over to river Purna, a kitchen and a dining hall.','મહેલ પૂર્ણ અભયારણ્ય સીમા પર આહવા-સોનગઢ રોડ પર આહવા થી 28 કિ.મી. સ્થિત એક ગામ છે અને thickest વાંસ વન કવર inGujarat છે. એક વન રેસ્ટ હાઉસ promontory આ આહવા-સોનગઢ મુખ્ય માર્ગ પર પૂર્ણ નદી પર બહાર jutting પર બાંધવામાં આવે છે. બાકીના ઘરમાં સુવિધાઓ જોડાયેલ સ્નાન અને શૌચાલય, એક અર્થઘટન કેન્દ્ર, નદી પૂર્ણા, એક રસોડું અને ડાઇનિંગ હોલ પર જોઈ એક અંદાજ છત ઉપર બેસીને વ્યવસ્થા સાથે ત્રણ રૂમ સમાવેશ થાય છે.',"+ R.drawable.g_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (7,3,'Dangs','Saputara','20.579017, 73.755105','Saputara has been developed as a planned hill resort with amenities like hotels, parks, swimming pools, boat club, theaters, ropeways and a museum. It is 172 kilometres (km) from Surat and 250 km from Mumbai. The Maharashtra stateborder is 4 km from Saputara. Excursions from Saputara can be made to the wild life sanctuary in the Mahal Bardipara forest, 60 km. and to Gira Waterfalls 52 km away.','સાપુતારા હોટેલ્સ, પાર્ક, સ્વિમિંગ પુલ, બોટ ક્લબ, થીએટર, ropeways અને સંગ્રહાલય જેવી સુવિધાઓ સાથે આયોજિત હિલ રિસોર્ટ તરીકે વિકસાવવામાં આવી છે. તે સુરત 172 કિલોમીટર (KM) અને મુંબઇ થી 250 કિ.મી.ના અંતરે આવેલ છે. મહારાષ્ટ્ર stateborder સાપુતારા થી 4 કિમી દૂર છે. સાપુતારા માંથી જોવા લાયક સ્થળો મહાલ Bardipara વન, 60 કિ.મી. માં જંગલી જીવન અભયારણ્ય માટે કરી શકાય છે. અને 52 કિમી દૂર ગીરા ધોધ.',"+ R.drawable.g_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (7,4,'Dangs','Sabari Dham','20.930944, 73.791749','Filled with fascinating mythology, this serene temple is supposed to have been where Lord Rama met Shabari while searching for his wife Sita and ate the berries she offered him, after tasting each one to make sure it was good. Three stones on which Lord Rama, his brother Lakshman and Shabari are said to have sat are still worshipped.','રસપ્રદ પૌરાણિક ભરપૂર, આ શાંત મંદિર ભગવાન રામ પોતાની પત્ની સીતા માટે શોધ કરતી વખતે Shabari મળ્યા અને તેમણે તે સારી હતી તેની ખાતરી કરવા માટે દરેક એક સ્વાદિષ્ટ પછી, તેને ઓફર તેનાં રસ ઝરતાં ફળોની ખાય જ્યાં આવી હોવાનું માનવામાં આવે છે. ભગવાન રામ, તેમના ભાઈ લક્ષ્મણ અને Shabari બેઠા હોવાનું કહેવાય છે કે જેના પર ત્રણ પત્થરો હજુ પૂજા થાય છે.',"+ R.drawable.g_d_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (7,5,'Dangs','Vaghai garden','20.754243, 73.498937','It is a vast garden developed by the forest department having a large variety of wild vegetation. It is situated about 2 km from Vaghai. It is a beautiful garden located on the Saputara (Nashik) highway from Vaghai. The garden has a variety of medicinal plants and a cactus.','તે જંગલી વનસ્પતિ વિશાળ વિવિધતા ધરાવતા વન વિભાગ દ્વારા વિકસાવવામાં એક વિશાળ બગીચો છે. તે Vaghai થી 2 કિ.મી. વિશે આવેલું છે. તે Vaghai ના સાપુતારા (નાસિક) હાઇવે પર સ્થિત એક સુંદર બગીચો છે. બગીચામાં ઔષધીય છોડ અને કેક્ટસ વિવિધ હોય છે.',"+ R.drawable.g_e_a +");");
		 
	    //Gandhinagar
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (8,1,'Gandhinagar','Adalaj','23.163995, 72.580180','Adalaj ni Vav is the famous Step Well, which is situated at around 18 km from the main city of Gandhinagar. This well is located in the Adalaj Village and is popular among tourists for its intricate carvings. Constructed by Queen Rudabai in 1499.','અડાલજ ની વાવ ગાંધીનગર મુખ્ય શહેરથી આશરે 18 કિ.મી.ના અંતરે આવેલું છે, જે સારી પ્રખ્યાત પગલું છે. આ સારી રીતે અડાલજ ગામ આવેલું છે અને તેના શાનદાર મહીમ કોતરણી પ્રવાસીઓ વચ્ચે લોકપ્રિય છે. 1499 માં રાણી Rudabai દ્વારા ઘડાયેલા છે.',"+ R.drawable.h_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (8,2,'Gandhinagar','Akshardham Temple','23.231864, 72.674144','Akshardham Temple or Swaminarayan Temple is one of the most popular temples of Gandhinagar. It is located just 2 km away from the main city and was constructed by Bochasanwasi Akshar Purushottam Swaminarayan Sanstha (BAPS). ','અક્ષરધામ મંદિર સ્વામિનારાયણ મંદિર ગાંધીનગર સૌથી વધુ લોકપ્રિય મંદિરો પૈકીનું એક છે. તે માત્ર 2 કિમી દૂર મુખ્ય શહેરથી સ્થિત છે અને બોચાસણવાસી અક્ષર પુરુષોત્તમ સ્વામિનારાયણ સંસ્થા (બીએપીએસ) દ્વારા બાંધવામાં આવ્યો હતો.',"+ R.drawable.h_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (8,3,'Gandhinagar','Gujrat science city','23.079070, 72.497656','Gujarat Science City was constructed by the Gujarat State Government for promoting science among common people. This Science City is famous for portraying working models, activity corner, contemporary exhibits and live demonstrations.','ગુજરાત સાયન્સ સિટી સામાન્ય લોકો વચ્ચે વિજ્ઞાન પ્રોત્સાહન માટે ગુજરાત રાજ્ય સરકાર દ્વારા બાંધવામાં આવ્યો હતો. આ સાયન્સ સિટી કામ મોડેલો, પ્રવૃત્તિ ખૂણામાં, સમકાલીન પ્રદર્શનો અને જીવંત પ્રદર્શનો ચિત્રણ માટે પ્રસિદ્ધ છે.',"+ R.drawable.h_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (8,4,'Gandhinagar','Indroda Nature Park','23.189941, 72.653536','Indroda Nature Park is also known as the Indroda Dinosaur and Fossil Park. This park is part of the Sarita Udhyan, which is situated in the famous Indroda village in Sector 9.  ','ઇન્દ્રોડા નેચર પાર્ક પણ ઇન્દ્રોડા ડાઈનોસોર અને અશ્મિભૂત પાર્ક તરીકે ઓળખાય છે. આ પાર્ક સેકટર 9 માં પ્રસિદ્ધ ઇન્દ્રોડા ગામમાં આવેલું છે, જે આ સરિતા Udhyan એક ભાગ છે.',"+ R.drawable.h_d_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (8,5,'Gandhinagar','Sarita Udhyan','23.202680, 72.659924','Sarita Udhyan is located in the Sector 9 of the Gandhinagar city, along the banks of Sabarmati River. This beautiful garden features various trees and recreation facilities. It is situated in the Indroda Village and has a popular deer park.','સરિતા Udhyan સાબરમતી નદી ની બેન્કો સાથે, ગાંધીનગર શહેરના સેક્ટર 9 માં સ્થિત થયેલ છે. આ સુંદર બગીચામાં વિવિધ વૃક્ષો અને મનોરંજન સુવિધાઓ આપે છે. તે ઇન્દ્રોડા ગામ આવેલું છે અને એક લોકપ્રિય DEER PARK છે.',"+ R.drawable.h_e_a +");");
		 
	    //gir somnath
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (9,1,'Gir somnath','Bhalka Tirtha','20.911684, 70.383791','At Bhalka Tirth Lord Krishna got hit by the arrow on his feet fired by Jara Savara , who has mistaken his feet at ears of a deer. A beautifull image of Lord krishan sleeping below a tree with Jara Savara is on display here.','ભાલકા તીર્થ ભગવાન કૃષ્ણ પર એક હરણ કાન પર તેના પગ ભૂલથી છે જે યાડ Savara દ્વારા બરતરફ તેના પગ પર તીર દ્વારા હિટ મળ્યો. યાડ Savara સાથે વૃક્ષ નીચે ભગવાન ક્રિશન સૂવું એક beautifull છબી અહીં ડિસ્પ્લે પર છે.',"+ R.drawable.i_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (9,2,'Gir somnath','Sasan-Gir National Park','21.124280, 70.824113','The Sasan-Gir National Park is the most popular sightseeing attraction of Sasan-Gir. This park was established in 1965 and it spreads over an area of 1412 sq. km. It is most popularly known for its population of Asiatic lions and considered as the safest protection areas.','આ સાસણ-ગીર નેશનલ પાર્ક સાસણ-ગીર સૌથી લોકપ્રિય સાઇટસીઇંગ આકર્ષણ છે. આ પાર્ક 1965 માં સ્થાપના કરી હતી અને તે 1412 ચો. કિમી વિસ્તારમાં ફેલાયેલું છે. તે સૌથી વધુ લોકપ્રિય એશિયાઈ સિંહના તેની વસ્તી માટે જાણીતા છે અને સલામત રક્ષણ વિસ્તારોમાં તરીકે ગણવામાં આવે છે.',"+ R.drawable.i_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (9,3,'Gir somnath','Somnath temple','20.887361, 70.406098','The Somnath Temple is situated at 46 km from Sasan-Gir. It is one of the most popular and ancient Hindu religious temple of India. The temple is said to be one of the richest temples of ancient India but it lost its charm after it was looted several times.','સોમનાથ મંદિર સાસણ-ગીર 46 કિ.મી.ના અંતરે આવેલું છે. ભારત સૌથી વધુ લોકપ્રિય અને પ્રાચીન હિન્દૂ ધાર્મિક મંદિર છે. આ મંદિર પ્રાચીન ભારતના ધનાઢ્ય મંદિરોમાંથી એક કહેવાય પરંતુ તે ઘણી વખત looted હતી પછી તે તેના વશીકરણ ગુમાવી છે.',"+ R.drawable.i_c_a +");");
	  
	    //jamnagar
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (10,1,'Jamnagar','Dhanvntri temple','22.479110, 70.060890','Dhanvantri Mandir was built under the personal supervision of Dr. Pranjivan Manekchand Mehta, Chief Medical Officer of Guru Govindsingh Hospital. After independence it gained the status of Ayurveda University. It has a good library, workshop and been a place of research and international seminars on Ayurveda- an ancient Indian medicinal system.','ધન્વંતરી મંદિર ડો Pranjivan Manekchand મહેતા, ગુરુ Govindsingh હોસ્પિટલ ચીફ મેડિકલ ઓફિસર વ્યક્તિગત દેખરેખ હેઠળ બાંધવામાં આવી હતી. સ્વતંત્રતા પછી તે આયુર્વેદ યુનિવર્સિટી ઓફ દરજ્જો મળ્યો. તે એક સારો પુસ્તકાલય, વર્કશોપ છે અને Ayurveda- એક પ્રાચીન ભારતીય ઔષધીય સિસ્ટમ પર સંશોધન અને આંતરરાષ્ટ્રીય પરિસંવાદો એક સ્થળ રહી.',"+ R.drawable.j_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (10,2,'Jamnagar','Joggers park','22.479966, 70.055376','This is a newly built botanical garden in the city, located adjacent to the Palace Ground. The original name of the park is Gulab Kunvarbaa Udhyan. It is highly utilized by the regular joggers and walkers of the city.','આ પેલેસ ગ્રાઉન્ડ અડીને શહેરમાં એક નવા બાંધવામાં બોટનિકલ ગાર્ડન, સ્થિત થયેલ છે. આ પાર્કની મૂળ નામ ગુલાબ Kunvarbaa Udhyan છે. તે ખૂબ જ શહેરના નિયમિત જોગર્સ અને વોકર્સ દ્વારા ઉપયોગ થાય છે.',"+ R.drawable.j_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (10,3,'Jamnagar','lakhota palace and museum','22.464752, 70.069350','On an island in the center of the lake stands the circular Lakhota tower, built for drought relief on orders from Jam Ranmalji after the failed monsoons in 1834, 1839 and 1846 made it difficult for the people of the city to find food and resources. Originally designed as a fort such that soldiers posted around it could fend off an invading enemy army with the lake acting as a moat, the tower known as Lakhota Palace now houses the Lakhota Museum. The collection includes artifacts spanning from 9th to 18th century, pottery from medieval villages nearby and the skeleton of a whale. The very first thing you see on entry, however, before the historical and archaeological information, is the guardroom with muskets, swords and powder flasks, reminding you of the structures original purpose and proving the martial readiness of the state at the time. The walls of the museum are also covered in frescoes depicting various battles fought by the Jadeja Rajputs. The fort is connected to the banks by two causeways, but is only accessible from the north side.','તળાવ મધ્યમાં એક ટાપુ 1834, 1839 અને 1846 માં નિષ્ફળ ચોમાસા પછી જામ Ranmalji પાસેથી ઓર્ડર પર દુષ્કાળ રાહત માટે બાંધવામાં પરિપત્ર લખોટા ટાવર, રહે તે મુશ્કેલ શહેરના લોકો ખોરાક અને સાધનો શોધવા માટે કરી હતી. મૂળભૂત રીતે તે તળાવ મોટ તરીકે કામ સાથે આક્રમણ દુશ્મન લશ્કર અટકાવવું શકે આસપાસ સૈનિકો પોસ્ટ કે ફોર્ટ જેમ કે રચાયેલ છે, લખોટા પેલેસ તરીકે ઓળખાય ટાવર હવે લખોટા મ્યુઝિયમ ધરાવે છે. આ સંગ્રહ 9 થી 18 મી સદી, માટીકામ નજીકના મધ્યયુગીન ગામો અને વ્હેલ ના હાડપિંજર પર લાંબી વસ્તુઓનો સમાવેશ થાય છે. તમે પ્રવેશ પર જોવા ખૂબ પ્રથમ વસ્તુ, જો કે, ઐતિહાસિક અને પુરાતત્વીય માહિતી પહેલાં, માળખું મૂળ હેતુ તમે યાદ અને તે સમયે રાજ્ય માર્શલ તૈયારી સાબિત બંદુક, તલવાર અને પાવડર ફ્લાસ્ક સાથે guardroom છે. સંગ્રહાલય દિવાલો પણ જાડેજા રાજપૂત દ્વારા લડ્યા વિવિધ યુદ્ધો દર્શાવતી ભીંતચિત્રો માં આવરાયેલ છે. આ કિલ્લો બે causeways દ્વારા બેન્કો સાથે જોડાયેલ છે, પરંતુ ઉત્તર બાજુ માંથી માત્ર સુલભ છે.',"+ R.drawable.j_c_a +");");
		db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (10,4,'Jamnagar','Lakhota Talav','22.465426, 70.064447','If lake is full of water then its a very good place to visit. You can easily spend 2 hours, will suggest you to take camera with you. Worth to visit, street food was awesome.','તળાવ પાણી સંપૂર્ણ છે, તો પછી તે મુલાકાત માટે ખૂબ જ સારું સ્થળ છે. તમે સરળતાથી તમારી સાથે કેમેરા લેવા માટે સૂચન કરશે, 2 કલાક ગાળી શકે છે. મુલાકાત માટે વર્થ, સ્ટ્રીટ ફૂડ ભયાનક હતી.',"+ R.drawable.j_d_a +");");
	
		
		 //junagdh
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (11,1,'Junagadh','Ashok Shilalekh','21.528511,70.481307','About 2 km east of Junagadh and 3 km from the foot of Girnar Hill, between the two places, is an edict of Emperor Ashoka inscribed on a rock dating from the third century BC. The Ashokan edicts impart moral instructions on dharma, harmony, tolerance, and peace.','જૂનાગઢ આશરે 2 કિમી પૂર્વ અને ગિરનાર હિલની તળેટીમાં માંથી 3 કિમી, બે સ્થળો વચ્ચે, ત્રીજી સદી પૂર્વે રોક ડેટિંગ પર ઉત્કીર્ણ સમ્રાટ અશોક ના આદેશે છે. આ અશોકન edicts ધર્મ, સંવાદિતા, સહનશીલતા, અને શાંતિ અંગેનું નૈતિક સૂચનો આપવાનો.',"+ R.drawable.k_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (11,2,'Junagadh','Ayurvedic Museum','21.520644,70.464845','Ayurvedic Museum, Junagarh is situated in Ayurvedic College at Sadarbag. It is located in the western part of the town. At this site, the tourists can learn more about ancient medicine. The museum also provides a detailed knowledge about natural medical treatment.','આયુર્વેદિક મ્યુઝિયમ, જુનાગઢ Sadarbag પર આયુર્વેદિક કોલેજ આવેલી છે. તે નગર પશ્ચિમ ભાગમાં સ્થિત થયેલ છે. આ સાઇટ પર, પ્રવાસીઓ પ્રાચીન દવા વિશે વધુ જાણી શકો છો. આ સંગ્રહાલયને પણ કુદરતી તબીબી સારવાર વિશે વિગતવાર જ્ઞાન પૂરું પાડે છે.',"+ R.drawable.k_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (11,3,'Junagadh','Damodar Kund','21.525632,70.486472','Damodar Kund is a sacred bathing tank located at the foot of Girnar Hill, in Gujarat. Situated near the Revati Kund, the tank marks the ascent to the numerous beautifully carved ancient Jain temples of Girnar. Damodar Kund is believed to be the place where Lord Shiva and Goddess Parvatis garment fell during a cruise.','દામોદર કુંડ ગુજરાતમાં ગિરનાર હિલની તળેટીમાં આવેલું એક પવિત્ર સ્નાન ટાંકી છે. આ રેવતી કુંડ નજીક આવેલું છે, ટેન્ક ગિરનાર અનેક સુંદર કોતરણી પ્રાચીન જૈન મંદિરો માટે આરોહ ચિહ્નિત કરે છે. દામોદર કુંડ ભગવાન શિવ અને દેવી પાર્વતી માતાનો કપડાના ક્રુઝ દરમિયાન ઘટીને જ્યાં સ્થળ માનવામાં આવે છે.',"+ R.drawable.k_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (11,4,'Junagadh','Datar Hills','21.483955,70.518040','2,779 feet high stepway is built for going up shrine of Jamiyalshah Datar.','2,779 ફુટ ઊંચી stepway Jamiyalshah ફ્લેટ ઓફ ફેલા ઉપર જવા માટે બાંધવામાં આવે છે. ',"+ R.drawable.k_d_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (11,5,'Junagadh','Kamleshwar Dam','21.198481,70.665806','The Kamleshwar Dam is situated within the Sasan-Gir National Park, in its very centre. This dam is built over one of the seven rivers that drain in the area of Gir Sanctuary. These rivers include Shingoda, Raval, Godavari, Macchundri, Hiran, Datardi and Saraswati.','આ Kamleshwar ડેમ તેની ખૂબ જ કેન્દ્ર માં, સાસણ-ગીર નેશનલ પાર્ક અંદર આવેલું છે. આ ડેમ ગીર અભયારણ્ય વિસ્તારમાં ગટર કે સાત નદીઓના એક પર બાંધવામાં આવે છે. આ નદીઓ શિંગોડા, રાવલ, ગોદાવરી, Macchundri, હિરણ, ધાતરડી અને સરસ્વતી સમાવેશ થાય છે.',"+ R.drawable.k_e_a +");");
		
	    	
	  //kheda
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (12,1,'Kheda','Ramji Mandir ','22.651734, 72.944101','Nadiad is Capital of kheda district in this town various perminent places for visit like Ramji temple.','નડિયાદ આ નગર રામજી મંદિર જેવા મુલાકાત માટે વિવિધ perminent સ્થળોએ ખેડા જિલ્લાના કેપિટલ છે.',"+ R.drawable.l_a_a +");");

	    
	  //kutch
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (13,1,'Kutch','Dholavira','23.880559, 70.213387','While today Dholavira narrates the story of the Old World, once upon a time it was where one of humanity  earliest and greatest civilizations flourished. Considered as one of the greatest cities of the Indus Valley civilization, set in the middle of what is now Kutch Desert Wildlife Sanctuary on an island in the Great Rann of Kutch, Dholavira was actually stumbled upon in 1968 by a J.P.','આજે ધોળાવીરા ઓલ્ડ વર્લ્ડ વાર્તા વર્ણન જ્યારે માનવતા વહેલું અને મહાન સંસ્કૃતિના એક વિકાસ, જ્યાં એકવાર એક સમય પર તે હતી. કચ્છના મોટા રણમાં એક ટાપુ પર હવે કચ્છ ડેઝર્ટ વન્યજીવન અભયારણ્ય છે શું મધ્યમાં માં સુયોજિત કરો, સિંધુ ખીણની સંસ્કૃતિ મહાન શહેરો પૈકીનું એક તરીકે ગણવામાં આવે છે, ધોળાવીરા ખરેખર એક જેપી દ્વારા 1968 માં ઓચિંતા હતી.',"+ R.drawable.m_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (13,2,'Kutch','kutch desert wildlife sanctuary','23.461894, 71.287469','This area is known to be a breeding ground for flamingoes and staging ground for pelicans, cranes, storks and many species ofwaterfowl. It is also an important site for animals like blue bulls, chinkaras and 1desert wolves, which have been sighted over here regularly. The site supports many species of birds and mammals which are locally and globally threatened. The site is also a wintering area for water birds. It is estimated that this wetland regularly supports over 40,000 water birds.','આ વિસ્તાર પેલિકન, ક્રેન્સ, Storks અને અનેક જાતિઓ ofwaterfowl માટે સંવર્ધન flamingoes માટે જમીન અને સ્ટેજીંગ જમીન તરીકે ઓળખાય છે. તે પણ અહીં નિયમિત પર દેખાયો કરવામાં આવી છે, જે વાદળી બળદ, chinkaras અને રણ વરુના, જેવા પ્રાણીઓ માટે એક મહત્વપૂર્ણ સાઇટ છે. આ સાઇટ સ્થાનિક અને વૈશ્વિક ધમકી આપી છે કે જે પક્ષીઓ અને સસ્તન પ્રાણીઓ અનેક જાતિઓ આધાર આપે છે. આ સાઇટ પણ પાણી પક્ષીઓ માટે ઠંડો વિસ્તાર છે. આ વેટલેન્ડ નિયમિત 40,000 પાણી પક્ષીઓ આધાર આપે છે કે અંદાજ છે.',"+ R.drawable.m_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (13,3,'Kutch','nirona village','23.463374, 69.522246','Nirona Village in Gujarat is also famous as one of the most popular of artisans village in the Kutch. An hamlet of around 50 odd families, it houses some of the most sought after artisans of the region. You can visit their houses cum workshops and see them at work.','ગુજરાતમાં Nirona ગામ પણ કચ્છમાં કલાકારો ગામ સૌથી લોકપ્રિય એક તરીકે પ્રખ્યાત છે. આશરે 50 વિચિત્ર પરિવારો એક હેમ્લેટ, તે સૌથી પ્રદેશના કલાકારો પછી માંગી કેટલાક ધરાવે છે. તમે તેમના ઘરો સાથે વર્કશોપ ની મુલાકાત લો અને તેમને કામ પર જોઈ શકો છો.',"+ R.drawable.m_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (13,4,'Kutch','The great rann of kutch','24.117928, 70.209503','Touted to be the largest stretch of salt marshes and the largest salt desert in the world, The Great Rann of Kutch attracts a large number of migratory species every year and is a paradise for bird watchers and lovers a like.','મીઠું ભેજવાળી જમીન સૌથી પટ અને વિશ્વમાં સૌથી Salt ડિઝર્ટ હોઈ વિનંતી, કચ્છના મોટા રણમાં દર વર્ષે યાયાવર પ્રજાતિઓ મોટી સંખ્યામાં આકર્ષે છે અને પક્ષીઓને જોનારામાં અને પ્રેમીઓ એક જેવા માટે સ્વર્ગ છે.',"+ R.drawable.m_d_a +");");

	    //mehsana
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (14,1,'Mehsana','Becharaji','23.503262, 72.046475','A short motor ride towards Chanasma and you come to the town of Becharaj and the temple of Bahuchar Mata, an incarnation of the Mother Goddess. Pilgrimages are undertaken to this site for vows fulfilled and boons granted. (Bahuchar Mata) is the patron goddess of the women folk who invoke her intervention in domestic violence and problems within the family. ','એક ટૂંકી મોટર ચાણસ્મા તરફ જુલમ અને તમે Becharaj ના નગર અને Bahuchar માતા, મધર ગોડેસ એક અવતાર ના મંદિર માટે આવે છે. યાત્રા મંજૂર પૂર્ણ શપથ અને boons માટે આ સાઇટ પર કરવામાં આવે છે. Bahuchar માતા  ઘરેલુ હિંસા અને કુટુંબ અંદર સમસ્યાઓ તેના હસ્તક્ષેપ જગાડવા જે સ્ત્રીઓ લોક આશ્રયદાતા દેવી છે.',"+ R.drawable.n_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (14,2,'Mehsana','Gambhu Jain Tirth','23.594774, 72.163787','The history of this place is believed to be a period earlier that Vikram 9th century. Once this was a large city. From references available it is known that, it was an established city long before even Patan City was founded. Its ancient names were Gambhira or Ghambhita. From gift papers in the possession of this temple, it becomes evident that in ancient time there were several Jain temples existing here. Also at this place several Jain volumes have been composed and written. The scattered ruins in the area here are a testimony of the antiquity of this place. This idol is believed to be of the period of Raja Samprati. From here several idols have been sent to Bombay and other places.','આ સ્થળ ઇતિહાસ સમયગાળા અગાઉ તે વિક્રમ 9 મી સદી હોવાનું માનવામાં આવે છે. આ એક વાર એક મોટું શહેર હતું. ઉપલબ્ધ સંદર્ભો પ્રતિ તે એક સ્થાપિત શહેર લાંબા પણ પાટણ શહેરની સ્થાપના કરી હતી હતી તે પહેલાં, કે ઓળખાય છે. તેના પ્રાચીન નામો Gambhira અથવા Ghambhita હતા. આ મંદિર પર કબજો ભેટ કાગળો પ્રતિ, તે પ્રાચીન સમયમાં અહીં હાલની અનેક જૈન મંદિરો હતા કે સ્પષ્ટ બની જાય છે. પણ આ સ્થળે અનેક જૈન ગ્રંથોમાં બનેલા અને લખવામાં આવ્યા છે. અહીં આ વિસ્તારમાં પથરાયેલા ખંડેર આ સ્થળ પ્રાચીન એક સાક્ષી છે. આ મૂર્તિ રાજા Samprati ના સમયગાળા હોવાનું માનવામાં આવે છે. અહીં કેટલાક મૂર્તિઓ બોમ્બે અને અન્ય સ્થળોએ મોકલવામાં આવ્યા છે.',"+ R.drawable.n_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (14,3,'Mehsana','Thol Bird Sanctuary','23.137252, 72.406962','Thol Wildlife Sanctuary is a shallow water reservoir situated 25 km northwest of Ahmedabad and most popular birding place near Ahmedabad after Nal Sarovar Bird Sanctuary which is about 50 km from Thol Wildlife Sanctuary. Geographically Thol Wildlife Sanctuary falls in Mehsana district of North Gujarat.','થોલ વન્યજીવન અભયારણ્ય થોલ વન્યજીવન અભયારણ્યમાં હવે લગભગ 50 કિમી  છે, જે નળ સરોવર પક્ષી અભયારણ્ય બાદ 25 કિમી  ઉત્તરપશ્ચિમ અમદાવાદ અને અમદાવાદ નજીક સૌથી વધુ લોકપ્રિય પક્ષીદર્શન સ્થળ આવેલું એક છીછરા પાણીમાં જળાશય છે. ભૌગોલિક થોલ વન્યજીવન અભયારણ્ય ઉત્તર ગુજરાતના મહેસાણા જિલ્લાના પડે છે.',"+ R.drawable.n_c_a +");");
	    
	    //Narmada
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (15,1,'Narmada','Dam viewpoints','21.647883, 72.567683','Dam Viewpoint is such a magnetic spot that attracts thousands of people to visit this place. Monsoon is the best time to visit here. You should go for this definitely.','ડેમ નજારો આ સ્થળ મુલાકાત લોકો હજારો લોકોને આકર્ષે છે, જેમ કે એક ચુંબકીય સ્થળ છે. વરસાદના અહીં મુલાકાત માટે શ્રેષ્ઠ સમય છે. તમે ચોક્કસપણે આ માટે જવા જોઈએ.',"+ R.drawable.o_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (15,2,'Narmada','Mahadev Temple','21.905371, 73.546661','Narmada is highly associated with Lord Shiva worship. The Banalingas are made naturally by the river Narmada which get worshipped in the temples or in the homes. In fact Narmada is ancient than Ganga even.','નર્મદા ખૂબ ભગવાન શિવની પૂજા સાથે સંકળાયેલ છે. આ Banalingas મંદિરો અથવા ઘરોમાં પૂજા વિચાર જે નદી નર્મદા કુદરતી કરવામાં આવે છે. હકીકતમાં નર્મદા પણ ગંગા કરતાં પ્રાચીન છે.',"+ R.drawable.o_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (15,3,'Narmada','Narmada River','21.647883, 72.567683','The river Narmada is one of the very holy rivers in Bharat. It is one o the seven holy rivers Hindus chant for purifications.','નર્મદા નદી ભારત માં ખૂબ જ પવિત્ર નદીઓ પૈકીની એક છે. તે શુદ્ધિકરણ માટે ગીત હિન્દુઓ સાત પવિત્ર નદીઓ ઓ છે.',"+ R.drawable.o_c_a +");");
	    
	    //navsari
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (16,1,'Navsari','Dandi Beach','20.887299, 72.796781','The beach adjacent to the village of Dandi. Made famous during the historic Salt March undertaken by Mahatma Gandhi and his followers in 1930, which earnestly began the Satyagraha movement, which espoused non-violent resistance as a means to achieve a goal.','દાંડી ગામ અડીને બીચ. આતુરતાપૂર્વક એક ધ્યેય હાંસલ કરવા માટે એક સાધન તરીકે અહિંસક પ્રતિકાર સ્વીકારવામાં જે સત્યાગ્રહ આંદોલન શરૂ કર્યું, જે 1930 માં મહાત્મા ગાંધી અને તેમના અનુયાયીઓ દ્વારા હાથ ધરવામાં ઐતિહાસિક સોલ્ટ માર્ચ દરમિયાન પ્રસિદ્ધ કરી હતી.',"+ R.drawable.p_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (16,2,'Navsari','Janki van','20.853568, 73.334239','The Janki Van at Bhinar in Vasda taluka of Navsari district in the coming days is expected to become a major tourist attraction for visitors to Saputara in Dang district. Developed under Gujarat Forestry Development Project by the social forestry department with Japan International Corporation Agencys financial assistance at a cost of Rs 4 crore, the Janki Van, which is spread over in 15 acre, has 54,000 trees of different species. Plantation areas are named as Ashok Van, Panchvati Van, Amravan, Sindoori Van, Chandan Van, Rashi-Nakshatra Van, Navgrah Van, Dashmul Van, Bili Van and Aushadi Van. People can know about each tree at an interpretation centre that has been set up at the Janki Van, where it is believed that Sita Mata had once lived. The tourists would get complete information about the plants and also about tribal culture, Ayurveda and Yoga at the interpretation centre. Janki Van will be inaugurated on August 2 by Chief Minister Anandiben Patel.','આગામી દિવસોમાં નવસારી જિલ્લાના Vasda તાલુકામાં Bhinar ખાતે Janki વેન ડાંગ જિલ્લામાં સાપુતારા મુલાકાતીઓ માટે એક મુખ્ય પ્રવાસી આકર્ષણ બની ધારણા છે. રૂ 4 કરોડ ખર્ચે જાપાન ઇન્ટરનેશનલ કોર્પોરેશન એજન્સી નાણાકીય સહાય સાથે સામાજિક ફોરેસ્ટ્રી વિભાગ દ્વારા ગુજરાત ફોરેસ્ટ્રી ડેવલપમેન્ટ પ્રોજેક્ટ હેઠળ વિકસાવવામાં, 15 એકર પર ફેલાય છે, જે Janki વેન, વિવિધ પ્રજાતિઓ 54,000 વૃક્ષો છે. વાવેતર વિસ્તારમાં અશોક વેન પંચવટી વેન Amravan, Sindoori વેન ચંદન વેન રાશિ-નક્ષત્ર વેન Navgrah વેન Dashmul વેન Bili વેન અને Aushadi વેન તરીકે નામ આપવામાં આવ્યું છે. લોકો તેને સીતા માતા એક વખત રહેતા હતા માનવામાં આવે છે કે જ્યાં Janki વેન ખાતે સ્થાપના કરવામાં આવી છે કે જે અર્થઘટન કેન્દ્ર ખાતે દરેક વૃક્ષ વિશે ખબર શકો છો. પ્રવાસીઓ અર્થઘટન કેન્દ્ર ખાતે આદિવાસી સંસ્કૃતિ, આયુર્વેદ અને યોગ વિશે પણ છોડ વિશે સંપૂર્ણ માહિતી મેળવી અને કરશે. Janki વેન મુખ્ય મંત્રી શ્રીમતી આનંદીબેન પટેલ દ્વારા 2 ઓગસ્ટ પર ઉદ્ઘાટન કરવામાં આવશે.',"+ R.drawable.p_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (16,3,'Navsari','Padamdungari Eco Campsite','20.837723, 73.411344','It  is a campsite located at about 30 km from Vyara town, and 8 km from Unai village. It is situated amongst the Sahyadri ranges, by the river Ambica. Treks, trails, winding up and down the hillocks, sunset activity, observation towers, relaxing woodlands, and medicinal groves are proposed attractions when you visit Padamdungari.','તે વ્યારા નગર થી લગભગ 30 કિમી દૂર અને ઉનાઈ ગામ થી 8 કિમી દૂર આવેલું છે એક campsite છે. તે નદી અંબિકા દ્વારા સહ્યાદ્રીની રેન્જ વચ્ચે આવેલું છે. પર્વતારોહણ, રસ્તાઓ, સમેટી અને તમે પદમડુંગરી મુલાકાત લો ત્યારે હિલ્લોક, સૂર્યાસ્ત પ્રવૃત્તિ, અવલોકન ટાવર, ઢીલું મૂકી દેવાથી જંગલો, અને ઔષધીય થતો નીચે આકર્ષણો સૂચિત કરવામાં આવે છે.',"+ R.drawable.p_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (16,4,'Navsari','Shri Chintamani Parshvanath','20.937278, 72.943111','It is the famous Jain pilgrimage in the district of 23rd Lord tirthankar Of Jains - Parshvanath. Many pilgrims go there regularly for worshiping God.','તે જૈનોના 23 ભગવાન તીર્થંકર જિલ્લા માં પ્રસિદ્ધ જૈન યાત્રાધામ છે  પાર્શ્વનાથ. ઘણા યાત્રાળુઓ ઈશ્વરની ભક્તિ માટે નિયમિત ત્યાં જાઓ.',"+ R.drawable.p_d_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (16,5,'Navsari','Unai Hot Springs','20.853568, 73.334239','hot springs, open to the public, are a great place to rejuvenate. Buses from Vansda village stop near the Unai Mata temple. Coming from Surat, Unai is on the way to Vansda','  જાહેર જનતા માટે ખુલ્લા હોત સ્પ્રિંગ્સ, કાયાકલ્પ કરવા માટે એક મહાન સ્થળ છે. વાંસદા ગામ બસો ઉનાઈ માતા મંદિર નજીક અટકાવો. સુરત આવતા, ઉનાઈ વાંસદા માર્ગ પર છે.',"+ R.drawable.p_e_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (16,6,'Navsari','Vansda National Park','20.693658, 73.535881','With trees reaching a height of 120 ft. the forests of Vansda are dense and varied. With the rain gods being generous over 2,000 mm rainfall, parts of the Park have moist deciduous forest with kaatas bamboo. Dry deciduous forest occurring in other areas has manvel bamboo and adds to the diversity of habitats. The variety of plants over 450 species keeps our eyes searching for more and leaves us content at the end of the day.','વૃક્ષો 120 ફૂટની ઊંચાઈ સુધી પહોંચી છે. વાંસદા ના જંગલો ગાઢ અને વૈવિધ્યસભર છે. વરસાદ દેવતાઓ ઉદાર (ઉપર 2,000 મીમી વરસાદ) હોવા સાથે, આ પાર્ક ભાગો kaatas વાંસ સાથે ભેજવાળી પાનખર જંગલ છે. અન્ય વિસ્તારોમાં બનતું શુષ્ક પાનખર જંગલ  (માન્વેલ) વાંસ છે અને આશ્રયસ્થાનો ની વિવિધતા માટે ઉમેરે છે. છોડ વિવિધ (450 પ્રજાતિઓ) વધુ માટે શોધ અમારી આંખો રાખે છે અને દિવસ ઓવરને અંતે સામગ્રી નહીં.',"+ R.drawable.p_f_a +");");
	    
	    //panchmahal
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (17,1,'Panchmahal(Godhra)','Kanelav Talav','22.783230, 73.642361','It is a nice pond set in a scenic setting, has offered refuge to generations of Godhra residents. It has beautiful scenery and a check-dam. Rotary Club Godhra have developed, with the help of local institutes and organizations, beautiful infrastructure at Kanelav, popularly known as Kanelav Picnic Point.','તે મનોહર સેટિંગ સેટ એક સરસ તળાવ છે, ગોધરા રહેવાસીઓ પેઢી માટે આશ્રય ઓફર કરે છે. તે સુંદર દૃશ્યાવલિ અને એક ચેક ડેમ છે. રોટરી ક્લબ ગોધરા લોકપ્રિય Kanelav પ્રવાસન બિંદુ તરીકે ઓળખાય છે સ્થાનિક સંસ્થાઓ અને સંસ્થાઓ, Kanelav ખાતે સુંદર ઇન્ફ્રાસ્ટ્રક્ચર, ની મદદ સાથે, વિકસાવી છે.',"+ R.drawable.q_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (17,2,'Panchmahal(Godhra)','Ram Sagar Talav','22.776978, 73.618093','It is another pond in the center of the town offers an additional focal point that serves as a place to relax and socialize. Ram Sagar Talav has been divided into two parts, and only a small drainage links them. At its center is landscaping where a statue of Sri Swami Vivekananda has been erected.','તે નગર મધ્યમાં અન્ય તળાવ આરામ અને સામાજિક સ્થળ તરીકે સેવા આપે છે કે જે વધારાના કેન્દ્રીય બિંદુ તક આપે છે. રામ સાગર તળાવ બે ભાગોમાં વિભાજિત કરવામાં આવી છે, અને માત્ર એક નાના ડ્રેનેજ તેમને જોડે છે. તેના કેન્દ્ર ખાતે શ્રી સ્વામી વિવેકાનન્દ એક પ્રતિમા બાંધવામાં આવ્યું છે જ્યાં ઉછેરકામ છે.',"+ R.drawable.q_b_a +");");
	
	    //patan
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (18,1,'Patan','Nalanda','25.617364, 85.140964','Nalanda ruins were nothing short of mesmerizing. They said that the excavated part is only 10% of the actual place. Still it is amazing. The famous song waada toh nibhaya from Johnny Mera Naam was shot here in 1970. I found the place very tranquil. Bihars glorious history echos through these ruins.','નાલંદા ખંડેર mesmerizing ટૂંકા કશું હતા. તેઓ ખોદકામ ભાગ હકીકતમાં જે સ્થળ માત્ર 10% જણાવ્યું હતું કે. હજુ પણ તે અમેઝિંગ છે. હું સ્થળ ખૂબ જ શાંત મળી જોની મેરા નામ ના પ્રખ્યાત ગીત waada તો nibhaya અહીં 1970 માં ગોળી ચલાવવામાં આવી હતી. આ ખંડેર મારફતે બિહારના ભવ્ય ઇતિહાસ echos.',"+ R.drawable.r_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (18,2,'Patan','Patna Museum','25.612676, 85.133239','Patna is not a well maintained city. But Patna museum is well maintained . Its functioning is started in 1915. Archaeological objects, coins, art objects, paintings, instruments.','નાલંદા ખંડેર mesmerizing ટૂંકા કશું હતા. તેઓ ખોદકામ ભાગ હકીકતમાં જે સ્થળ માત્ર 10% જણાવ્યું હતું કે. હજુ પણ તે અમેઝિંગ છે. હું સ્થળ ખૂબ જ શાંત મળી જોની મેરા નામ ના પ્રખ્યાત ગીત waada તો nibhaya અહીં 1970 માં ગોળી ચલાવવામાં આવી હતી. આ ખંડેર મારફતે બિહારના ભવ્ય ઇતિહાસ echos.',"+ R.drawable.r_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (18,3,'Patan','Shahid Smarak','25.599780, 85.122057','Shahid Smarak is located in front of Bihar Vidhan Sabha in the memory of seven students killed during hoisting flag on Secretariat during Quit India Movement in 1942.','શાહિદ સ્મારક 1942 ની ભારત છોડો ચળવળમાં દરમિયાન સચિવાલય પર ધ્વજ ફરકાવવો દરમિયાન માર્યા ગયેલા સાત વિદ્યાર્થીઓને મેમરી બિહાર વિધાનસભા સામે સ્થિત થયેલ છે.',"+ R.drawable.r_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (18,4,'Patan','Takhat Shri Harimandirji Patna Sahib','25.596024, 85.229836','Its about an hours journey from Patna Railway Station . The road is very narrow and are prone to traffic . So make it a point to visit the Gurdwara in the morning .','તેના પટણા રેલવે સ્ટેશન પરથી એક કલાક પ્રવાસ વિશે. આ માર્ગ ખૂબ જ સાંકડી છે અને ટ્રાફિક કહે છે. તેથી તે સવારે ગુરુદ્વારા મુલાકાત બિંદુ બનાવે છે.',"+ R.drawable.r_d_a +");");
		
	    //porbandar
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (19,1,'porbandar','Air port','21.647872, 69.660891','The airfield is spread over 278.32 Acres, has a 4500 feet long runway and an apron that can accommodate 2 ATR 72 aircraft. The new 4000 square metre Terminal Building at Porbandar Airport has been built at a cost of Rs. 13.50 crore. The building has six Check-in Counters and two Conveyor Belts in the Arrivals hall and can handle 100 arriving and 100 departing passengers at a time.','એરફિલ્ડ 278,32 એકરમાં ફેલાયેલો છે, એક 4500 ફૂટ લાંબી રનવે અને 2 ATR 72 વિમાનો બેસી શકે છે કે એક આવરણ ધરાવે છે. પોરબંદર એરપોર્ટ પર નવા 4000 ચોરસ મીટર ટર્મિનલ બિલ્ડિંગમાં રૂ ખર્ચે બાંધવામાં આવ્યો છે. 13.50 કરોડ. આ ઇમારત છ ચેક ઇન કાઉન્ટર અને આ આવકો હોલ બે કન્વેયર બેલ્ટ ધરાવે છે અને એક સમયે પહોંચ્યા 100 અને 100 પ્રસ્થાન મુસાફરો સંભાળી શકે છે.',"+ R.drawable.s_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (19,2,'porbandar','Barda Hills','21.809523, 69.711581','Barda Hills is located at a distance of 15 km from Porbandar. The hill of Barda is famous for its woods, which is spread over an area of 190 square km.','બરડા હિલ્સ પોરબંદરથી 15 કિમી ના અંતરે સ્થિત થયેલ છે. બરડા હિલ 190 ચોરસ કિલોમીટરના વિસ્તારમાં ફેલાયેલું છે, જે તેના વુડ્સ, માટે પ્રખ્યાત છે.',"+ R.drawable.s_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (19,3,'porbandar','Bharat Mandir','21.656267, 69.617406','Pictures, sculptures and symbols and portraying Indian culture and religion have been exhibited in this place. It is the mirror of Indian tradition.','ચિત્રો, શિલ્પો અને સંજ્ઞાઓ અને ભારતીય સંસ્કૃતિ અને ધર્મ ચિત્રણ આ જગ્યાએ પ્રદર્શિત કરવામાં આવી છે. ભારતીય પરંપરા દર્પણ છે.',"+ R.drawable.s_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (19,4,'porbandar','Bileshwar Shiva Temple','71.215847','Bileshwar Shiva Temple is an ancient temple since early 7th century, situated at a distance of 15 km to the east of Porbandar Bileshwar Shiva Temple is built in Gujarati architecture style. The building of the temple is multi storied, made in pyramid like shape rather than a spire. The exterior of the temple is embellished with arc like theme.','Bileshwar શિવ મંદિર ગુજરાતી સ્થાપત્ય શૈલી માં બાંધવામાં આવે છે પોરબંદર Bileshwar શિવ મંદિર પૂર્વમાં 15 કિમી ના અંતરે આવેલું પ્રારંભિક 7 મી સદીથી એક પ્રાચીન મંદિર છે. આ મંદિરના બાંધકામ આકાર બદલે શિખર જેવા પિરામિડ કરવામાં બહુ ઐતિહાસિક છે. મંદિરના બાહ્ય થીમ માંગો આર્ક સાથે embellished છે.',"+ R.drawable.s_d_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (19,5,'porbandar','Birla cement factory,Chowpatty','21.619677, 69.632574','Porbandars coastal line is just half a kilometre away from the city. Popularly known as Chowpatty, it is one of the main attractions for the local population as well as tourists, to visit and enjoy the beautiful scenery throughout the year.','પોરબંદર દરિયાકાંઠાના રેખા માત્ર અડધા કિલોમીટર દૂર શહેરમાંથી છે. લોકપ્રિય Chowpatty તરીકે ઓળખાય છે, તે મુલાકાત લો અને સમગ્ર વર્ષ દરમિયાન સુંદર દૃશ્યાવલિ આનંદ, સ્થાનિક વસ્તી તેમજ પ્રવાસીઓ માટે મુખ્ય આકર્ષણ છે.',"+ R.drawable.s_e_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (19,6,'porbandar','Raj Mahal - Huzoor Palace','21.628694, 69.613817','At a short distance from Huzoor Palace, there is monument called Daria Rajmahal. It was built by Maharaja Bhavsinhji with the assistance of designs from state engineer Phulchand Parekh, in late 19th century.','Huzoor પેલેસ એક ટૂંકા અંતર પર, Daria રાજમહેલ કહેવાય સ્મારક છે. તે 19 મી સદીના અંતમાં રાજ્ય એન્જિનિયર Phulchand પારેખ પાસેથી ડિઝાઇન સહાય સાથે મહારાજા ભાવસિંહજી દ્વારા બાંધવામાં આવ્યું હતું.',"+ R.drawable.s_f_a +");");
	    
	    //rajkot
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (20,1,'Rajkot','Aji Dam','22.260745, 70.850435','It is situated 8 Kilometers from Rajkot and supplies the towns water.','તે રાજકોટ થી 8 કિલોમીટર આવેલું અને નગર પાણી પુરવઠો છે.',"+ R.drawable.t_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (20,2,'Rajkot','Bangdi Bazaar','22.299383, 70.805301','The MARKET in the old part of the city is a maze of narrow alleyways, lanes and cul-de-sacs. Shop fronts and fort paths displaying a vast array of embroidered fabrics, beadwork, bandhanis and readymade flow in profusion to the colorful riot of Bangles in every shape, form and color giving the market the apt title of Bangdi Bazaar.','શહેરના જૂના ભાગ The MARKET સાંકડી alleyways, લેન અને બહાર નીકળવાના માર્ગ વિનાની દ-કોથળીઓ એક માર્ગ છે. બજારમાં Bangdi બઝાર તત્પર શીર્ષક આપીને એમ્બ્રોઇડરી કાપડ, Beadwork, bandhanis અને દરેક આકાર, સ્વરૂપ બંગડીઓ રંગબેરંગી તોફાન માટે પ્રોફ્યુશનમાં રેડીમેડ પ્રવાહ અને રંગ એક વિશાળ એરે પ્રદર્શિત દુકાન મોરચા અને ફોર્ટ પાથ.',"+ R.drawable.t_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (20,3,'Rajkot','Hanging Bridge (Julta pul)','22.818306, 70.842263','Hanging Bridge is located in Morbi of Rajkot. It was made from wire ropes and wood, during the British rule. The bridge is 165 feet long and 4.5 feet broad and has been constructed over the River Machchhu. Crossing the bridge is a sensational experience for the visitors.','અટકી બ્રિજ રાજકોટ મોરબી માં સ્થિત થયેલ છે. તે બ્રિટિશ શાસન દરમિયાન, વાયર રોપ્સ અને લાકડામાંથી બનાવવામાં આવી હતી. આ પુલ 165 ફૂટ લાંબી અને 4.5 ફૂટ વ્યાપક છે અને નદી મચ્છુ પર બિલ્ટ કરી દેવામાં આવી છે. આ પુલ પાર મુલાકાતીઓ માટે એક સનસનીખેજ અનુભવ છે.',"+ R.drawable.t_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (20,4,'Rajkot','Jetpur','23.003987, 70.892077','70 km from Rajkot on the way to Junagadh lies Jetpur, a town renowned in history as a center for Block printing and dyeing.','જૂનાગઢ માર્ગ પર રાજકોટથી 70 કિ.મી. જેતપુર, બ્લોક પ્રિન્ટીંગ અને રંગાઈ માટે એક કેન્દ્ર તરીકે ઇતિહાસમાં પ્રસિદ્ધ નગર આવેલું છે.',"+ R.drawable.t_d_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (20,5,'Rajkot','Lal Pari Lake','22.306587, 70.844886','A picturesque picnic spot, 5 kms. from Rajkot.','મનોહર પિકનિક સ્પોટ, 5 કિ.મી.. રાજકોટ થી.',"+ R.drawable.t_e_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (20,6,'Rajkot','Randarda Lake','22.290659, 70.840679','Randarda Lake has turned into a bird watchers paradise with a large number of migratory birds arriving at the water body. The 100 year old lake is home to many indigenous birds also.','',"+ R.drawable.t_f_a +");");
	   

	    //Sabarkatha
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (21,1,'Sabarkatha','Dev Ni Mori, Shamlaji','23.684887, 73.368142','The remains of a Buddhist monastery belonging to 3rd-4th century AD have been unearthed from Devni Mori, about two km from Shamlaji. The presence of a stupa and monastery has reconfirmed that during the early centuries of Christian era, there had been a strong presence of Buddhists in Vadnagar. ','3 જી -4 થી સદી એડી સાથે જોડાયેલા બૌદ્ધ મઠ અવશેષો Devni મોરી, શામળાજી લગભગ બે કિલોમીટર શોધી કાઢવામાં આવ્યું હતું. એક સ્તૂપ અને આશ્રમ હાજરી ખ્રિસ્તી યુગના પ્રારંભિક સદીઓ દરમિયાન, વડનગરમાં બૌદ્ધ મજબૂત હાજરી કરવામાં આવી હતી કે reconfirmed છે.',"+ R.drawable.u_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (21,2,'Sabarkatha','Polo Forest Site, Vijaynagar','23.988326, 73.219635','The Polo Camp site is located in Vijayanagar taluka of Sabarkantha districts and is near to Vanaj Forest area, Harnav River and Damsite. Presently at Polo Campsite Nature Education Camps, Wild Life training and seminars are organized. The area is biologically rich in flora and fauna and the dense forests and river side provide an excellent opportunity to experience nature.','આ પોલો કેમ્પ સાઇટ, સાબરકાંઠા જિલ્લાઓમાં વિજયનગર તાલુકાના સ્થિત છે અને Vanaj જંગલ વિસ્તાર, હરણાવ નદી અને Damsite નજીક છે. હાલમાં પોલો Campsite પ્રકૃતિ શિક્ષણ શિબિરો પર, વાઇલ્ડ લાઇફ તાલીમ અને પરિસંવાદો યોજવામાં આવે છે. આ વિસ્તારમાં પ્રકૃતિ અનુભવ કરવા માટે એક ઉત્તમ તક પૂરી પાડે છે વનસ્પતિ અને પ્રાણીસૃષ્ટિ અને ગાઢ જંગલો અને નદી બાજુ માં જૈવિક સમૃદ્ધ છે.',"+ R.drawable.u_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (21,3,'Sabarkatha','Shamlaji Temple','23.690124, 73.385872','Shamlaji is one of the largest pilgrim temples of the Sabarkantha district in India. It is more commonly known among locals as Dhodi Dhwaja Vada because it always has a white silk flag flittering on top of temple. Its unique designs on the outer part of temple is one of its greatest attractions.','શામળાજી ભારતમાં સાબરકાંઠા જિલ્લાના સૌથી યાત્રાળુ મંદિરો પૈકીનું એક છે. તે હંમેશા મંદિર ટોચ પર એક સફેદ રેશમ ધ્વજ flittering છે, કારણ કે તે સામાન્ય રીતે વધુ Dhodi Dhwaja વડા તરીકે સ્થાનિકો વચ્ચે ઓળખાય છે. મંદિરના બહારના ભાગ પર તેની અનન્ય ડિઝાઇન તેની મહાન આકર્ષણ છે.',"+ R.drawable.u_c_a +");");
	  
	  //Surat
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (22,1,'Surat','Dumas','21.108584, 72.718372','	Dumas Beach is a popular destination situated in the vicinity of Surat, at a distance of 18 km away. The palm and casuarinas fringed sea shores of Dumas are popular among the leisure travellers visiting Surat.','ડુમસ બીચ દૂર 18 કિમી દૂર ના અંતરે સુરત ની નજીકમાં આવેલું એક લોકપ્રિય સ્થળ છે. ડુમસ પામ અને casuarinas ફ્રિંજ્ડ સમુદ્ર કિનારે સુરત મુલાકાત લેઝર પ્રવાસીઓ વચ્ચે લોકપ્રિય છે.',"+ R.drawable.v_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (22,2,'Surat','Hazira','21.130463, 72.689020','	Hajira, situated at a distance of 28 km from Surat, is a popular destination of beach lovers. The casuarinas, fringed sandy beaches of Hajira, lies on the creek of the Arabian Sea.','સુરત થી 28 કિ.મી. ના અંતરે આવેલું Hajira, બીચ પ્રેમીઓ એક લોકપ્રિય સ્થળ છે. આ casuarinas, Hajira ફ્રિંજ્ડ રેતાળ દરિયાકિનારા, અરબી સમુદ્રના ખાડી પર આવેલું છે.',"+ R.drawable.v_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (22,3,'Surat','Iskon temple','21.247407, 72.791624','	very good architecture of Iskon temple.The idol of Lord Krishna and Radha is very good.Paintings on life of krishna inside the temple are must see. This is one of the most worship temple in the city. Here you can view Krishana Lord. The temple was located in main area and well connected with public vehicles.','ભગવાન કૃષ્ણ અને રાધા ની ઇસ્કોન temple.The મૂર્તિ ખૂબ જ સારી સ્થાપત્ય જોવા જ જોઈએ છે મંદિર અંદર કૃષ્ણ જીવન પર ખૂબ જ good.Paintings છે. આ શહેરમાં સૌથી પૂજા મંદિર છે. અહીં તમે Krishana ભગવાન જોઈ શકો છો. આ મંદિર મુખ્ય વિસ્તારમાં સ્થિત છે અને સારી રીતે જાહેર વાહનો સાથે જોડાયેલું હતું',"+ R.drawable.v_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (22,4,'Surat','Jawaharlal Nehru Garden (choppati)','21.185287, 72.806223','Choppati refers to the Jawaharlal Nehru Garden of the city of Surat.  This garden, considered as the largest and the oldest of all the gardens in the city, also houses a musical fountain. Choppati is a popular destination in Surat visited by the picnic-goers.','Choppati સુરત શહેરના જવાહરલાલ નેહરુ ગાર્ડન ઉલ્લેખ કરે છે. સૌથી મોટી અને શહેરના તમામ બગીચાઓમાં સૌથી જૂના તરીકે ગણવામાં આ ગાર્ડન પણ એક સંગીતમય ફુવારો ધરાવે છે. Choppati પિકનિક-જનારાઓથી દ્વારા મુલાકાત લીધી સુરતમાં એક લોકપ્રિય સ્થળ છે.',"+ R.drawable.v_d_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (22,5,'Surat','Suvali','21.165017, 72.618341','	Suvali Beach, located at a distance of 20 km from Surat, is a black sandy beach popular among locals for picnic. Located amidst industries, it offers a refreshing scenic view. Mostly visited by solitude seekers, the beach is slowly developing into a tourist spot. Currently, there are not many options for food and drinks.','Suvali બીચ, સુરત થી 20 કિ.મી. ના અંતરે આવેલું છે, પિકનિક માટે સ્થાનિક લોકોમાં લોકપ્રિય કાળા રેતાળ બીચ છે. ઉદ્યોગો વચ્ચે સ્થિત છે, તે એક પ્રેરણાદાયક રમણીય દૃશ્ય આપે છે. મોટે ભાગે, એકાંત સીકર્સ દ્વારા મુલાકાત લીધી બીચ ધીમે ધીમે એક પ્રવાસન સ્થળ માં વિકાસશીલ છે. હાલમાં, ખોરાક અને પીણાં માટે ઘણા વિકલ્પો નથી.',"+ R.drawable.v_e_a +");");
	    
	    //Surendranagar
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (23,1,'Surendranagar','Chotila Hill','22.423714, 71.193468','Chotila Hill, located approx 60 km from Surendranagar city, is a place for the worship of Chamunda Mataji, a Hindu goddess and Kuladevi (divine protectress) of the Gohil clan of Rajaput. Thousands of pilgrims walk as far as 300 km to this place. The main business in Chotila is the production of pure ghee from the milk of the huge numbers of livestock here.','આશરે 60 કિમી સુરેન્દ્રનગર શહેર સ્થિત ચોટિલા હિલ, ચામુંડા માતાજી, એક હિન્દૂ દેવી અને Rajaput ના ગોહિલ કુળ Kuladevi (ડિવાઇન સંરક્ષક) પૂજા માટે એક સ્થળ છે. યાત્રાળુઓ હજારો આ જગ્યાએ જ્યાં સુધી 300 કિમી ચાલવા. ચોટિલા માં મુખ્ય બિઝનેસ અહીં પશુધન વિશાળ સંખ્યામાં દૂધ શુદ્ધ ઘી ઉત્પાદન છે.',"+ R.drawable.w_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (23,2,'Surendranagar','Different  Market','22.723849, 71.633356','The city is also home to a big textile and clothing market, specialising in saris. Big clothing showrooms are located in the city on Jawahar Road and Vithal Press Road. The city has a wholesale grain market called Mehta Market.','આ શહેર સાડીઓ વિશેષતા, એક મોટી કાપડ અને કપડાં બજારમાં પણ ઘર છે. મોટા કપડાં શોરુમ જવાહર રોડ અને Vithal પ્રેસ રોડ પર શહેરમાં સ્થિત થયેલ છે. આ શહેર મહેતા બજાર કહેવાય જથ્થાબંધ અનાજ બજાર છે.',"+ R.drawable.w_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (23,3,'Surendranagar','Gondal','21.960396, 70.792839','Gondal is a small, leafy town in the district. The most attractive tourist spot in Gondal is the 17th century, Navlakha Palace complex, which is one of the oldest and most beautiful of Gondals monuments. It was built on the riverbank.','ગોંડલ જિલ્લામાં નાના, પાંદડાવાળા નગર છે. ગોંડલ સૌથી આકર્ષક પર્યટન સ્થળ 17 મી સદી છે, એક સૌથી જૂની અને ગોંડલ માતાનો સ્મારકો સૌથી સુંદર છે, જે જટિલ નવલખા પેલેસ. તે નદી કિનારે બાંધવામાં આવી હતી.',"+ R.drawable.w_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (23,4,'Surendranagar','Nalsarovar Bird Sanctuary','22.792595, 72.023150','Nalsarovar Bird Sanctuary is a 100 km? plus bird sanctuary located on the border between Ahmedabad and Surendranagar and attracts over 210 species of birds during the four months of winter, including the endangered wild ass and the blackbuck, its migratory bird population includes Rosy Pelicans, White Storks, Brahminy Ducks, Herons and Flamingos. ','Nalsarovar પક્ષી અભયારણ્ય 100 કિમી દૂર છે? વત્તા પક્ષી અભયારણ્ય અમદાવાદ અને સુરેન્દ્રનગર વચ્ચે સરહદ પર સ્થિત થયેલ છે અને ભયંકર જંગલી ગધેડા અને કાળિયાર સહિત શિયાળામાં ચાર મહિના દરમિયાન પક્ષીઓ 210 પ્રજાતિઓ આકર્ષે છે, તેના યાયાવર પક્ષી વસ્તી રોઝી પેલિકન, વ્હાઇટ Storks, બ્રાહ્મીની બતક, હેરોન અને સમાવેશ થાય છે ફ્લેમિંગો.',"+ R.drawable.w_d_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (23,5,'Surendranagar','Tarnetar Fair','22.711906, 71.587601','Tarnetar is famous for its fair, popularly known as the Trinetreshwar Mahadev Mela (Fair), held near the Trinetreshwar Mahadev temple. Villagers from all over the region, dressed in their colorful traditional costumes and exquisite jewellery, throng Tarnetar during this fair.','તરણેતરના લોકપ્રિય Trinetreshwar મહાદેવ મંદિર નજીક યોજાયેલી Trinetreshwar મહાદેવ મેલા (FAIR) તરીકે ઓળખાય છે તેની વાજબી માટે પ્રખ્યાત છે. સમગ્ર વિસ્તારમાં થી ગ્રામવાસીઓ, આ મેળામાં તેમના પરંપરાગત રંગબેરંગી કોસ્ચ્યુમ અને ઉત્કૃષ્ટ જ્વેલરી, ભીડ તરણેતરના પહેર્યો.',"+ R.drawable.w_e_a +");");
	    
	    //Tapi
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (24,1,'Tapi','Bardoli','21.133363, 73.106800','It is situated 34 kms. from Surat. This town saw the birth of the No-Tax movement, led by Sardar Patel, in protest of the British rule under which farmers barely had enough to feed their families, let alone to pay the exorbitant taxes. ','34 કિ.મી. આવેલું છે. સુરત. આ નગર ખેડૂતો ભાગ્યે જ પોતાના કુટુંબને ખવડાવવા, એકલા દો બેહદ કર ચૂકવવા માટે પૂરતા હતા, જે હેઠળ બ્રિટિશ શાસન વિરોધ, સરદાર પટેલ આગેવાની કોઈ ટેક્સ ચળવળ જન્મ થયો હતો.',"+ R.drawable.x_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (24,2,'Tapi','Kevdi Eco compsite','22.520171, 73.935320','	Kevdi is a well-stocked forest ecotourism site situated on the route connecting Jambughoda Sanctuary and Ratanmahal Sanctuary. It has a wonderful location as it is situated at the bank of a river. It comes under the Chhota Udepur forest division. It is loacted 14 kms away from the Kanjeta Eco Campsite.','Kevdi જાંબુઘોડા અભયારણ્ય અને Ratanmahal અભયારણ્ય જોડાઈ માર્ગ પર આવેલું એક સારાં એવાં વન ઈકો ટુરીઝમ સાઇટ છે. તે નદી બેંક પર આવેલું છે, કે એક અદ્ભુત સ્થાન ધરાવે છે. તે છોટા ઉદેપુર વન વિભાગ હેઠળ આવે છે. તે 14 કિલોમીટર દૂર Kanjeta ઇકો કેમ્પસાઇટ થી loacted છે',"+ R.drawable.x_b_a +");");
	   
	    //Vadodra
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (25,1,'Vadodra','Chhota udepur','22.309068, 74.010916','Towards the border with Rajasthan, Chhota Udepur shares a history with Devgadh Baria and Rajpipla as one of the three princely states of eastern Gujarat. The small town sits on the edge of a big lake, with a series of temples along the skyline.','રાજસ્થાન સાથેની સરહદ તરફ, છોટા ઉદેપુર પૂર્વ ગુજરાતના ત્રણ રજવાડાઓના એક તરીકે દેવગઢ બારીયા અને રાજપીપળા સાથે ઇતિહાસ ધરાવે છે. નાના નગર આકાશ સાથે મંદિરો એક શ્રેણી સાથે એક મોટી તળાવ ની ધાર પર બેસે છે.',"+ R.drawable.y_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (25,2,'Vadodra','EME Temple','22.331495, 73.191960',' Indian army does not usually have separate places of worship for the different faiths, but this temple, built by the Electrical and Mechanical Engineering (EME) corps entirely out of aluminum sheets, worships Dakshinamurti, another name for Shiva as an ultimate teacher.','  ભારતીય આર્મી સામાન્ય રીતે વિવિધ ધર્મો માટે પૂજા અલગ સ્થળોએ નથી, પરંતુ સંપૂર્ણપણે એલ્યુમિનિયમ શીટ્સ બહાર ઇલેક્ટ્રિકલ અને મિકેનિકલ એન્જિનિયરિંગ (ઇએમઇ) કોર્પ્સ દ્વારા બાંધવામાં મંદિર, દક્ષિણામૂર્તિ, અંતિમ શિક્ષક તરીકે શિવ માટે અન્ય નામ કરે છે.',"+ R.drawable.y_b_a +");");
	   
	    //Valsad
	      db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (26,1,'Valsad','Dharampur','20.542883, 73.177064','Once a princely state with diplomatic relations with various parties that kept the area relatively peaceful, this town on the banks of Swargavahini river at the foothills of the Sahyadri mountain range has a quaint colonial air and a pleasant climate throughout the year.','વિસ્તાર પ્રમાણમાં શાંત રાખવામાં કે વિવિધ પક્ષો સાથે રાજદ્વારી સંબંધો સાથે રજવાડું જાય, સહ્યાદ્રી પર્વતમાળાની તળેટીમાં Swargavahini નદી ની બેન્કો પર આ નગર એક અનોખું કોલોનીયલ એર અને સમગ્ર વર્ષ દરમિયાન એક સુખદ આબોહવા ધરાવે છે.',"+ R.drawable.z_a_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (26,2,'Valsad','Sai baba Temple','20.550250, 72.961592','Shri Sai Baba Temple is located 1.5 km south of the Tithal beach, overlooking the Arabian Sea. The temple has restrooms for visitors along with necessary items for performing pujas and rituals.','શ્રી સાઇબાબા મંદિર અરબી સમુદ્ર overlooking, 1.5 કિમી દક્ષિણે Tithal બીચ સ્થિત થયેલ છે. આ મંદિર pujas અને ધાર્મિક વિધિઓ કરવા માટેની જરૂરી વસ્તુઓ સાથે મુલાકાતીઓ માટે આરામખંડ છે.',"+ R.drawable.z_b_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (26,3,'Valsad','Sanjan','20.193285, 72.824292','Sanjan is a small town in the Valsad District. It is situated just inside the Gujarat-Maharashtra border. Sanjan was one of the primary Parsi settlements in India. It is believed to have been found by Zoroastrian refugees, whose descendants are today known as the Parsis, who sought asylum in Gujarat after they were compelled to flee Iran.','Sanjan વલસાડ જિલ્લાના એક નાનકડા નગર છે. તે માત્ર ગુજરાત મહારાષ્ટ્ર સરહદ અંદર આવેલું છે. Sanjan ભારતમાં પ્રાથમિક પારસી વસાહતો હતી. તે જેની વંશજો છે આજે તેઓ ઈરાન ભાગી માટે ફરજ પાડી હતી પછી ગુજરાતમાં આશ્રય માગ્યો હતો જે ગૌણ સમુદાયોમાં પારસીઓ, તરીકે પણ ઓળખાય છે Zoroastrian શરણાર્થીઓ, દ્વારા મળી આવ્યા હોવાનું માનવામાં આવે છે.',"+ R.drawable.z_c_a +");");
	    db.execSQL("INSERT INTO City(ID,C_ID,City_Name,Name,Distance,Info,InfoG,pc) VALUES (26,4,'Valsad','Tithal','20.597814, 72.894845','Tithal beach located in Valsad is a wonderful beach with the perfect combination of beauty and solitude. This black sand beach with peaceful atmosphere and serene beauty is frequented by lot of travellers whole through the year. ','Sanjan વલસાડ જિલ્લાના એક નાનકડા નગર છે. તે માત્ર ગુજરાત મહારાષ્ટ્ર સરહદ અંદર આવેલું છે. Sanjan ભારતમાં પ્રાથમિક પારસી વસાહતો હતી. તે જેની વંશજો છે આજે તેઓ ઈરાન ભાગી માટે ફરજ પાડી હતી પછી ગુજરાતમાં આશ્રય માગ્યો હતો જે ગૌણ સમુદાયોમાં પારસીઓ, તરીકે પણ ઓળખાય છે Zoroastrian શરણાર્થીઓ, દ્વારા મળી આવ્યા હોવાનું માનવામાં આવે છે.',"+ R.drawable.z_d_a +");");
		   
	    
	
	    
	    
	    //photos
	
	
	db.execSQL("CREATE TABLE photos (Name TEXT,photo INTEGER);");
	
	//Ahmedabad
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Hutheesing Jain Temple',"+ R.drawable.a_a_a+");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Jumma Masjid',"+ R.drawable.a_b_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('kankaria lake',"+ R.drawable.a_c_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('kankaria lake',"+ R.drawable.a_c_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('kankaria lake',"+ R.drawable.a_c_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('kankaria lake',"+ R.drawable.a_c_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('kankaria lake',"+ R.drawable.a_c_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('kankaria lake',"+ R.drawable.a_c_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('kankaria lake',"+ R.drawable.a_c_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('kankaria lake',"+ R.drawable.a_c_h +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Law Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Manek Chowk',"+ R.drawable.a_e_a+");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Manek Chowk',"+ R.drawable.a_e_b+");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Manek Chowk',"+ R.drawable.a_e_c+");");
	

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_i +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_j +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_k +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_l +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabarmati Ashram',"+ R.drawable.a_f_m +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sidi Saiyyed jali',"+ R.drawable.a_g_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sidi Saiyyed jali',"+ R.drawable.a_g_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sidi Saiyyed jali',"+ R.drawable.a_g_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sidi Saiyyed jali',"+ R.drawable.a_g_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sidi Saiyyed jali',"+ R.drawable.a_g_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sidi Saiyyed jali',"+ R.drawable.a_g_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sidi Saiyyed jali',"+ R.drawable.a_g_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sidi Saiyyed jali',"+ R.drawable.a_g_h +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vastrapur Lake',"+ R.drawable.a_h_a +");");

	
	
	//Amreli
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nagnath Temple',"+ R.drawable.b_a_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nagnath Temple',"+ R.drawable.b_a_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nagnath Temple',"+ R.drawable.b_a_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nagnath Temple',"+ R.drawable.b_a_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nagnath Temple',"+ R.drawable.b_a_e +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Port pipavav',"+ R.drawable.b_b_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Port pipavav',"+ R.drawable.b_b_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Port pipavav',"+ R.drawable.b_b_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Port pipavav',"+ R.drawable.b_b_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Port pipavav',"+ R.drawable.b_b_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Port pipavav',"+ R.drawable.b_b_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Port pipavav',"+ R.drawable.b_b_g +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ramji mandir',"+ R.drawable.b_c_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ramji mandir',"+ R.drawable.b_c_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ramji mandir',"+ R.drawable.b_c_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ramji mandir',"+ R.drawable.b_c_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ramji mandir',"+ R.drawable.b_c_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ramji mandir',"+ R.drawable.b_c_f +");");
	
	
	//Anand
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Amul dairy',"+ R.drawable.c_a_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Amul dairy',"+ R.drawable.c_a_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Amul dairy',"+ R.drawable.c_a_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Amul dairy',"+ R.drawable.c_a_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Amul dairy',"+ R.drawable.c_a_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Amul dairy',"+ R.drawable.c_a_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Amul dairy',"+ R.drawable.c_a_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Amul dairy',"+ R.drawable.c_a_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Amul dairy',"+ R.drawable.c_a_i +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ranchhodrai Temple',"+ R.drawable.c_b_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ranchhodrai Temple',"+ R.drawable.c_b_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ranchhodrai Temple',"+ R.drawable.c_b_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ranchhodrai Temple',"+ R.drawable.c_b_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ranchhodrai Temple',"+ R.drawable.c_b_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ranchhodrai Temple',"+ R.drawable.c_b_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ranchhodrai Temple',"+ R.drawable.c_b_g +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sri Sri Radha Giridhari',"+ R.drawable.c_c_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sri Sri Radha Giridhari',"+ R.drawable.c_c_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sri Sri Radha Giridhari',"+ R.drawable.c_c_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sri Sri Radha Giridhari',"+ R.drawable.c_c_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sri Sri Radha Giridhari',"+ R.drawable.c_c_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sri Sri Radha Giridhari',"+ R.drawable.c_c_f +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Mandir',"+ R.drawable.c_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Mandir',"+ R.drawable.c_d_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Mandir',"+ R.drawable.c_d_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Mandir',"+ R.drawable.c_d_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Mandir',"+ R.drawable.c_d_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Mandir',"+ R.drawable.c_d_f +");");
	

	
	//palanpur
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ambaji mandir',"+ R.drawable.d_a_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ambaji mandir',"+ R.drawable.d_a_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ambaji mandir',"+ R.drawable.d_a_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ambaji mandir',"+ R.drawable.d_a_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ambaji mandir',"+ R.drawable.d_a_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ambaji mandir',"+ R.drawable.d_a_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ambaji mandir',"+ R.drawable.d_a_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ambaji mandir',"+ R.drawable.d_a_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ambaji mandir',"+ R.drawable.d_a_i +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Balaram Mahadev Temple',"+ R.drawable.d_b_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Balaram Mahadev Temple',"+ R.drawable.d_b_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Balaram Mahadev Temple',"+ R.drawable.d_b_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Balaram Mahadev Temple',"+ R.drawable.d_b_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Balaram Mahadev Temple',"+ R.drawable.d_b_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Balaram Mahadev Temple',"+ R.drawable.d_b_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Balaram Mahadev Temple',"+ R.drawable.d_b_g +");");
	 
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Koteshwar Ambaji',"+ R.drawable.d_c_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Koteshwar Ambaji',"+ R.drawable.d_c_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Koteshwar Ambaji',"+ R.drawable.d_c_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Koteshwar Ambaji',"+ R.drawable.d_c_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Koteshwar Ambaji',"+ R.drawable.d_c_e +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mangalya Van Ambaji',"+ R.drawable.d_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mangalya Van Ambaji',"+ R.drawable.d_d_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mangalya Van Ambaji',"+ R.drawable.d_d_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mangalya Van Ambaji',"+ R.drawable.d_d_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mangalya Van Ambaji',"+ R.drawable.d_d_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mangalya Van Ambaji',"+ R.drawable.d_d_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mangalya Van Ambaji',"+ R.drawable.d_d_g +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sardarkrushinagar Dantiwada Agricultural University',"+ R.drawable.d_e_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sardarkrushinagar Dantiwada Agricultural University',"+ R.drawable.d_e_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sardarkrushinagar Dantiwada Agricultural University',"+ R.drawable.d_e_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sardarkrushinagar Dantiwada Agricultural University',"+ R.drawable.d_e_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sardarkrushinagar Dantiwada Agricultural University',"+ R.drawable.d_e_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sardarkrushinagar Dantiwada Agricultural University',"+ R.drawable.d_e_f +");");
	
	
		    //bharuch
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gayatri Mata Temple',"+ R.drawable.e_a_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gayatri Mata Temple',"+ R.drawable.e_a_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gayatri Mata Temple',"+ R.drawable.e_a_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gayatri Mata Temple',"+ R.drawable.e_a_d +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Golden bridge',"+ R.drawable.e_b_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Golden bridge',"+ R.drawable.e_b_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Golden bridge',"+ R.drawable.e_b_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Golden bridge',"+ R.drawable.e_b_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Golden bridge',"+ R.drawable.e_b_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Golden bridge',"+ R.drawable.e_b_f +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nilkantheshwar',"+ R.drawable.e_c_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nilkantheshwar',"+ R.drawable.e_c_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nilkantheshwar',"+ R.drawable.e_c_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nilkantheshwar',"+ R.drawable.e_c_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nilkantheshwar',"+ R.drawable.e_c_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nilkantheshwar',"+ R.drawable.e_c_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nilkantheshwar',"+ R.drawable.e_c_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nilkantheshwar',"+ R.drawable.e_c_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Nilkantheshwar',"+ R.drawable.e_c_i +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Temple',"+ R.drawable.e_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Temple',"+ R.drawable.e_d_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Temple',"+ R.drawable.e_d_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Temple',"+ R.drawable.e_d_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Temple',"+ R.drawable.e_d_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Temple',"+ R.drawable.e_d_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Temple',"+ R.drawable.e_d_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Temple',"+ R.drawable.e_d_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Swaminarayan Temple',"+ R.drawable.e_d_i +");");	    
	
	
		    
		    //dahod
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Chhab Talav',"+ R.drawable.f_a_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Chhab Talav',"+ R.drawable.f_a_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Chhab Talav',"+ R.drawable.f_a_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Chhab Talav',"+ R.drawable.f_a_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Chhab Talav',"+ R.drawable.f_a_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Chhab Talav',"+ R.drawable.f_a_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Chhab Talav',"+ R.drawable.f_a_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Chhab Talav',"+ R.drawable.f_a_h +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dahod fair',"+ R.drawable.f_b_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dahod fair',"+ R.drawable.f_b_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dahod fair',"+ R.drawable.f_b_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dahod fair',"+ R.drawable.f_b_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dahod fair',"+ R.drawable.f_b_e +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kali Dam Shiv Temple',"+ R.drawable.f_c_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kali Dam Shiv Temple',"+ R.drawable.f_c_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kali Dam Shiv Temple',"+ R.drawable.f_c_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kali Dam Shiv Temple',"+ R.drawable.f_c_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kali Dam Shiv Temple',"+ R.drawable.f_c_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kali Dam Shiv Temple',"+ R.drawable.f_c_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kali Dam Shiv Temple',"+ R.drawable.f_c_g +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Aurangzeb Fort',"+ R.drawable.f_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Aurangzeb Fort',"+ R.drawable.f_d_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Aurangzeb Fort',"+ R.drawable.f_d_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Aurangzeb Fort',"+ R.drawable.f_d_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Aurangzeb Fort',"+ R.drawable.f_d_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Aurangzeb Fort',"+ R.drawable.f_d_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Aurangzeb Fort',"+ R.drawable.f_d_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Aurangzeb Fort',"+ R.drawable.f_d_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Aurangzeb Fort',"+ R.drawable.f_d_i +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Aurangzeb Fort',"+ R.drawable.f_d_j +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Najmi Masjid',"+ R.drawable.f_e_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Najmi Masjid',"+ R.drawable.f_e_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Najmi Masjid',"+ R.drawable.f_e_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Najmi Masjid',"+ R.drawable.f_e_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Najmi Masjid',"+ R.drawable.f_e_e +");");
	
		    
		    //dangs
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Girmal Waterfall',"+ R.drawable.g_a_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Girmal Waterfall',"+ R.drawable.g_a_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Girmal Waterfall',"+ R.drawable.g_a_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Girmal Waterfall',"+ R.drawable.g_a_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Girmal Waterfall',"+ R.drawable.g_a_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Girmal Waterfall',"+ R.drawable.g_a_f +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_i +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_j +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_k +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_l +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_m +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_n +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Mahal Eco campsite',"+ R.drawable.g_b_o +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_i +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_j +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_k +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Saputara',"+ R.drawable.g_c_l +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabari Dham',"+ R.drawable.g_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabari Dham',"+ R.drawable.g_d_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabari Dham',"+ R.drawable.g_d_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabari Dham',"+ R.drawable.g_d_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabari Dham',"+ R.drawable.g_d_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabari Dham',"+ R.drawable.g_d_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sabari Dham',"+ R.drawable.g_d_g +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vaghai garden',"+ R.drawable.g_e_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vaghai garden',"+ R.drawable.g_e_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vaghai garden',"+ R.drawable.g_e_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vaghai garden',"+ R.drawable.g_e_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vaghai garden',"+ R.drawable.g_e_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vaghai garden',"+ R.drawable.g_e_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vaghai garden',"+ R.drawable.g_e_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vaghai garden',"+ R.drawable.g_e_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vaghai garden',"+ R.drawable.g_e_i +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vaghai garden',"+ R.drawable.g_e_j +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Vaghai garden',"+ R.drawable.g_e_k +");");
		    
		    //Gandhinagar
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Adalaj',"+ R.drawable.h_a_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Adalaj',"+ R.drawable.h_a_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Adalaj',"+ R.drawable.h_a_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Adalaj',"+ R.drawable.h_a_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Adalaj',"+ R.drawable.h_a_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Adalaj',"+ R.drawable.h_a_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Adalaj',"+ R.drawable.h_a_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Adalaj',"+ R.drawable.h_a_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Adalaj',"+ R.drawable.h_a_i +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Akshardham Temple',"+ R.drawable.h_b_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Akshardham Temple',"+ R.drawable.h_b_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Akshardham Temple',"+ R.drawable.h_b_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Akshardham Temple',"+ R.drawable.h_b_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Akshardham Temple',"+ R.drawable.h_b_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Akshardham Temple',"+ R.drawable.h_b_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Akshardham Temple',"+ R.drawable.h_b_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Akshardham Temple',"+ R.drawable.h_b_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Akshardham Temple',"+ R.drawable.h_b_i +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gujrat science city',"+ R.drawable.h_c_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gujrat science city',"+ R.drawable.h_c_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gujrat science city',"+ R.drawable.h_c_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gujrat science city',"+ R.drawable.h_c_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gujrat science city',"+ R.drawable.h_c_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gujrat science city',"+ R.drawable.h_c_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gujrat science city',"+ R.drawable.h_c_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Gujrat science city',"+ R.drawable.h_c_h +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Indroda Nature Park',"+ R.drawable.h_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Indroda Nature Park',"+ R.drawable.h_d_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Indroda Nature Park',"+ R.drawable.h_d_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Indroda Nature Park',"+ R.drawable.h_d_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Indroda Nature Park',"+ R.drawable.h_d_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Indroda Nature Park',"+ R.drawable.h_d_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Indroda Nature Park',"+ R.drawable.h_d_g +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sarita Udhyan',"+ R.drawable.h_e_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sarita Udhyan',"+ R.drawable.h_e_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sarita Udhyan',"+ R.drawable.h_e_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sarita Udhyan',"+ R.drawable.h_e_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sarita Udhyan',"+ R.drawable.h_e_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sarita Udhyan',"+ R.drawable.h_e_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sarita Udhyan',"+ R.drawable.h_e_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sarita Udhyan',"+ R.drawable.h_e_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sarita Udhyan',"+ R.drawable.h_e_i +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sarita Udhyan',"+ R.drawable.h_e_j +");");
	
	
		    //gir somnath
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_i +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_j +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_k +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Bhalka Tirtha',"+ R.drawable.i_a_l +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_i +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_j +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_k +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Sasan-Gir National Park',"+ R.drawable.i_b_l +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Somnath temple',"+ R.drawable.i_c_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Somnath temple',"+ R.drawable.i_c_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Somnath temple',"+ R.drawable.i_c_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Somnath temple',"+ R.drawable.i_c_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Somnath temple',"+ R.drawable.i_c_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Somnath temple',"+ R.drawable.i_c_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Somnath temple',"+ R.drawable.i_c_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Somnath temple',"+ R.drawable.i_c_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Somnath temple',"+ R.drawable.i_c_i +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Somnath temple',"+ R.drawable.i_c_j +");");
		   
		    //jamnagar
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhanvntri temple',"+ R.drawable.j_a_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhanvntri temple',"+ R.drawable.j_a_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhanvntri temple',"+ R.drawable.j_a_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhanvntri temple',"+ R.drawable.j_a_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhanvntri temple',"+ R.drawable.j_a_e +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Joggers park',"+ R.drawable.j_b_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Joggers park',"+ R.drawable.j_b_b +");");	    
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_i +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_j +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_k +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_l +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_m +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_n +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_o +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('lakhota palace and museum',"+ R.drawable.j_c_p +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Lakhota Talav',"+ R.drawable.j_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Lakhota Talav',"+ R.drawable.j_d_b +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Lakhota Talav',"+ R.drawable.j_d_c +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Lakhota Talav',"+ R.drawable.j_d_d +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Lakhota Talav',"+ R.drawable.j_d_e +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Lakhota Talav',"+ R.drawable.j_d_f +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Lakhota Talav',"+ R.drawable.j_d_g +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Lakhota Talav',"+ R.drawable.j_d_h +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Lakhota Talav',"+ R.drawable.j_d_i +");");
	/*
		    //junagdh
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
		    //kheda
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
		  
		    //kutch
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
		    //mehsana
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
		    
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
		    //Narmada
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
		   
		    //navsari
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
		    //panchmahal
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
		   
		    //patan
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
		  
		    //porbandar
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
		    
		    //rajkot
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	
		    //sabarkatha
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
		  //surat
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
		   
		    //surendranagar
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
		   
		    //tapi
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");

		   
		    //vadodra
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
		  
		    //valsad
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Garden',"+ R.drawable.a_d_a +");");
	
	
	*/
		    
	/////////*************
	
	
	
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhuleti',"+ R.drawable.a_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhuleti',"+ R.drawable.a_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhuleti',"+ R.drawable.a_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhuleti',"+ R.drawable.a_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhuleti',"+ R.drawable.a_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhuleti',"+ R.drawable.a_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dhuleti',"+ R.drawable.a_7 +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Diwali',"+ R.drawable.b_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Diwali',"+ R.drawable.b_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Diwali',"+ R.drawable.b_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Diwali',"+ R.drawable.b_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Diwali',"+ R.drawable.b_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Diwali',"+ R.drawable.b_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Diwali',"+ R.drawable.b_7 +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ganesh Chaturthi',"+ R.drawable.c_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ganesh Chaturthi',"+ R.drawable.c_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ganesh Chaturthi',"+ R.drawable.c_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ganesh Chaturthi',"+ R.drawable.c_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ganesh Chaturthi',"+ R.drawable.c_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ganesh Chaturthi',"+ R.drawable.c_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Ganesh Chaturthi',"+ R.drawable.c_7 +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Holi',"+ R.drawable.d_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Holi',"+ R.drawable.d_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Holi',"+ R.drawable.d_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Holi',"+ R.drawable.d_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Holi',"+ R.drawable.d_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Holi',"+ R.drawable.d_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Holi',"+ R.drawable.d_7 +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Jalaram jayanti',"+ R.drawable.e_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Jalaram jayanti',"+ R.drawable.e_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Jalaram jayanti',"+ R.drawable.e_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Jalaram jayanti',"+ R.drawable.e_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Jalaram jayanti',"+ R.drawable.e_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Jalaram jayanti',"+ R.drawable.e_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Jalaram jayanti',"+ R.drawable.e_7 +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Janmashtami',"+ R.drawable.f_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Janmashtami',"+ R.drawable.f_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Janmashtami',"+ R.drawable.f_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Janmashtami',"+ R.drawable.f_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Janmashtami',"+ R.drawable.f_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Janmashtami',"+ R.drawable.f_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Janmashtami',"+ R.drawable.f_7 +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kite Festival',"+ R.drawable.g_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kite Festival',"+ R.drawable.g_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kite Festival',"+ R.drawable.g_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kite Festival',"+ R.drawable.g_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kite Festival',"+ R.drawable.g_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kite Festival',"+ R.drawable.g_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kite Festival',"+ R.drawable.g_7 +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kutch Mahotsava',"+ R.drawable.h_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kutch Mahotsava',"+ R.drawable.h_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kutch Mahotsava',"+ R.drawable.h_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kutch Mahotsava',"+ R.drawable.h_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kutch Mahotsava',"+ R.drawable.h_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kutch Mahotsava',"+ R.drawable.h_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Kutch Mahotsava',"+ R.drawable.h_7 +");");

	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Modhera Dance Festival',"+ R.drawable.i_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Modhera Dance Festival',"+ R.drawable.i_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Modhera Dance Festival',"+ R.drawable.i_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Modhera Dance Festival',"+ R.drawable.i_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Modhera Dance Festival',"+ R.drawable.i_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Modhera Dance Festival',"+ R.drawable.i_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Modhera Dance Festival',"+ R.drawable.i_7 +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Muharram',"+ R.drawable.j_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Muharram',"+ R.drawable.j_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Muharram',"+ R.drawable.j_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Muharram',"+ R.drawable.j_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Muharram',"+ R.drawable.j_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Muharram',"+ R.drawable.j_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Muharram',"+ R.drawable.j_7 +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Navratri',"+ R.drawable.k_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Navratri',"+ R.drawable.k_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Navratri',"+ R.drawable.k_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Navratri',"+ R.drawable.k_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Navratri',"+ R.drawable.k_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Navratri',"+ R.drawable.k_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Navratri',"+ R.drawable.k_7 +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Rkshbandhan',"+ R.drawable.l_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Rkshbandhan',"+ R.drawable.l_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Rkshbandhan',"+ R.drawable.l_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Rkshbandhan',"+ R.drawable.l_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Rkshbandhan',"+ R.drawable.l_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Rkshbandhan',"+ R.drawable.l_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Rkshbandhan',"+ R.drawable.l_7 +");");
	
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dussehra',"+ R.drawable.m_1 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dussehra',"+ R.drawable.m_2 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dussehra',"+ R.drawable.m_3 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dussehra',"+ R.drawable.m_4 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dussehra',"+ R.drawable.m_5 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dussehra',"+ R.drawable.m_6 +");");
	db.execSQL("INSERT INTO photos (Name,photo) VALUES ('Dussehra',"+ R.drawable.m_7 +");");
	
	
	
	
	//festival
    db.execSQL("CREATE TABLE festival (F_ID INTEGER, Name TEXT, Info TEXT, InfoG TEXT, pc INTEGER);");
	
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (1,'Dhuleti','Dhuleti Holi, the Hindu festival marked by colors, fun and gaiety, falls on the day after full moon day in the month of Phalgun (February – March). Dhuleti 2016 date is March 24 and is the day when people play with Holi colors. The first day of the festival is the Holika Dahan or lighting of bonfireand it is on March 23.','info',"+ R.drawable.a_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (2,'Diwali','The festival of Dussehra is unique in its perception and significance. According to the great Hindu epic Ramayana, Lord Ram killed Ravana on the tenth day that is Dussehra. It is called as triumph of virtue over sin or immorality. Ravana is said to have abducted Rams wife, Sita and was also known as a dictating ruler. The end of Ravana meant end of bad and evil spirit as he was a demon by birth too.  ','info',"+ R.drawable.b_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (3,'Dussehra','The festival of Dussehra is unique in its perception and significance. According to the great Hindu epic Ramayana, Lord Ram killed Ravana on the tenth day that is Dussehra. It is called as triumph of virtue over sin or immorality. Ravana is said to have abducted Rams wife, Sita and was also known as a dictating ruler. The end of Ravana meant end of bad and evil spirit as he was a demon by birth too.  ','info',"+ R.drawable.m_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (4,'Ganesh Chaturthi','In Gujarat this Ganesh Chaturthi is one of the most well-liked festivals. It is celebrated in honor of Lord Ganesh who is supposed to be the eliminator of all obstacles. This fiesta is celebrated with imposing processions that are carried out by moving huge idols of Lord Ganesh. These idols are festooned in bright outfits and overstated with valuable jewels.','info',"+ R.drawable.c_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (5,'Holi','The spring festival of Holi is distinguished in Gujarat in the month of Phalgun or in the months of February and March. The event of Holi is distinguished with colors and people of this state resound with the tunes of the folk-song, Govinda ala re, zara matki sambhal Brijbala. Fun and gambol is also redefined in diverse forms in the cheerful celebrations here. People welcome each other with colors and thus improve the emotion of harmony. The illumination of beacon also forms a particular trait in the Holi festival when renowned in Gujarat.','info',"+ R.drawable.d_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (6,'Jalaram jayanti','virpur is the birthplace of Shree Jalaram Bapa.The main shrine of Jalaram Bapa is located at Virpur. The shrine is actually the house complex where Jalaram lived during his lifetime. The shrine houses the belongings of Jalaram and the deities of Rama, Sita, Lakshamana and Hanuman worshipped by him. It also has on display the Jholi and Danda said to be given by God.[4] But the main attraction is the portrait of Jalaram Bapa. There is also an actual black and white photo of Jalaram Bapa, taken one year before his death.','info',"+ R.drawable.e_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (7,'Janmashtami','Janmashtami is recognized for the delivery centenary of Lord Krishna. It is renowned in the state of Gujarat along with in India with huge passion. It is prearranged in this state in the month of July and August as per the English calendar. On this day the Hindu people of Gujarat keeps daylong fasts and also keeps themselves stirring while chanting tones and verses in the respect of the noble till midnight. The statue of Lord Krishna is suffused and then placed on a swing. Rasila is executed to reconstruct incidents from the existence of the noble and to commemorate his adore for his beloved, Radha.','info',"+ R.drawable.f_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (8,'Kite Festival','The tourism authorities of Gujarat systematize this fiesta every year in the month of February according to the English calendar. This accepted festival not only illustrates folk dancing, music, poetry, ballads, local handicrafts and jewelry but also brings the citizens from all over the state to tender a whole fresh articulation to the term Communal Harmony.','info',"+ R.drawable.g_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (9,'Kutch Mahotsava','The tourism authorities of Gujarat systematize this fiesta every year in the month of February according to the English calendar. This accepted festival not only illustrates folk dancing, music, poetry, ballads, local handicrafts and jewelry but also brings the citizens from all over the state to tender a whole fresh articulation to the term Communal Harmony.','info',"+ R.drawable.h_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (10,'Modhera Dance Festival','This dance fiesta is celebrated at the Sun Temple of Modhera that is situated at a distance of about 60 kilometers. It is detained in the month of January every year and is celebrated for a distance of three days. This carnival is celebrated in respect of the Indian classical dance and is measured exclusive when contrasted to other dance festivals in the Indian subcontinent.','info',"+ R.drawable.i_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (11,'Muharram','This is the most admired Muslim fiesta celebrated in the state of Gujarat with much passion. The major underline of this festival is the Tazia parade that has been in the city of Ahmedabad of Gujarat for centuries. It also includes acrobats, drummers and singers processions. The momentous implication of this festival lies in the fact that the Mughal sovereign Jahangir and his beloved wife Noor Jahan often watched it from the teen darwaza or triple arches. This fiesta also reflects the accurate worldly strength of the state.','info',"+ R.drawable.j_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (12,'Navratri','Navaratri is a festival dedicated to the worship of the Hindu deity Durga. The wordNavaratri means nine nights in Sanskrit, nava meaning nine and ratri meaning nights.[2]During these nine nights and ten days, nine forms of Devi are worshiped. ','info',"+ R.drawable.k_1 +");");
	db.execSQL("INSERT INTO festival (F_ID,Name,Info,InfoG,pc) VALUES (13,'Rkshbandhan','he festival is a Hindu festival which has religious and secular aspects and celebrates the love and duty between brothers and sisters. The festival is also popularly used to celebrate any brother-sister relationship between men and women who are relatives or biologically unrelated.','info',"+ R.drawable.l_1 +");");
	
	
	
	
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
