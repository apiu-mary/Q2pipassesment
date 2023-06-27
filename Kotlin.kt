fun main(){
  
   var story1= Storyteller("Buraje","The Two Huts","Kikuyu")
   story1.tellStory()
   var story2= Translator("Wanjiru Shiku","The Ghost of Garbatula","Borana","Kiswahili")
   story2.translateStories()


}
class Stories(var title:String,var morallesson:String,var description:String,var agegroup:String){


}
open class  Storyteller(var name:String,var title: String,var language:String){
   fun tellStory(){
       println("$name is telling $title in $language")
   }
}
class  Translator(name: String,title: String,language: String ,var targetLanguage:String):Storyteller( name,title,language){
   fun translateStories(){
       println("$name translates $title from $language to $targetLanguage ")
   } 


}
