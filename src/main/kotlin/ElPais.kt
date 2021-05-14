class ElPais : Newspaper{
    override fun publish(report: Report) :String{
        return report.paragraph2
    }
}