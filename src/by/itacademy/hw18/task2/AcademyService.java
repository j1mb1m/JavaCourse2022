package by.itacademy.hw18.task2;

public class AcademyService {

    @AcademyInfo(year = 2023)
    public void methodWithAnnotation(){
    }

    @AcademyInfo()
    public void methodWithDefaultAnnotation(){
    }

    public void methodWithoutAnnotation(){
    }

}
