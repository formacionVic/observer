class EFE {
    var reports = mutableListOf(Report("uno","dos","tres"))


    fun newReport(p1:String,p2:String,p3:String){
        reports.add(Report(p1,p2,p3))
    }
}