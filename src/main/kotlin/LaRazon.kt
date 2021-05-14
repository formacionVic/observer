class LaRazon : Newspaper{
    override fun publish(report: Report){
        return println(report.paragraph3)
    }
}