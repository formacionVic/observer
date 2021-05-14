class ElDiario : Newspaper{
    override fun publish(report: Report) :String{
        return report.paragraph1
    }
}