class LaRazon : Newspaper{
    override fun publish(report: Report) :String{
        return report.paragraph3
    }
}