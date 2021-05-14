class ABC : Newspaper{
    override fun publish(report: Report) {
        return println(report.paragraph1+report.paragraph2+report.paragraph3)
    }

}