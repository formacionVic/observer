class ABC : Newspaper{
    override fun publish(report: Report) :String{
        return report.paragraph1+report.paragraph2+report.paragraph3
    }

}