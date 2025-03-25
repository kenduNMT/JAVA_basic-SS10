package bt7;

class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisorName;

    // Constructor
    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa);
        if (researchTopic.isEmpty() || supervisorName.isEmpty()) {
            throw new IllegalArgumentException("Thông tin nghiên cứu không hợp lệ");
        }
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    // Getter và Setter
    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    // Ghi đè phương thức getDetails
    @Override
    public String getDetails() {
        return super.getDetails() + ", Đề tài: " + researchTopic + ", GVHD: " + supervisorName;
    }
}