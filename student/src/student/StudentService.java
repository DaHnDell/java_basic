package student;

import static student.StudentUtils.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unchecked")
public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	private List<Student> totalSortedStudents;
	private List<Student> numSortedStudents;
	private List<Student> nameSortedStudents;

	{ // 초기화 블럭, 호출부분도 여기서 처리하기
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\tj\\Desktop\\Student.txt"));) {
			students = (List<Student>) ois.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("파일 검색이 실패하여 초기 더미데이터를 삽입합니다.");
			students.add(new Student(999, "구구구", 999, 999, 999));
			System.out.println("데이터 삽입 완료.");
			e.printStackTrace();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		cloneAndSort();
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void studentSave(){
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\tj\\Desktop\\Student.txt"));){
			oos.writeObject(students);	
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public void save() {
//		try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("StudentData.ser"));){ // try - catch 안에서 사용하면 별다른 클로즈 작업 없이도 사용이 가능
//			stream.writeObject(students);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
//	}

//	public void studentRead() throws FileNotFoundException, IOException, ClassNotFoundException {
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\tj\\Desktop\\Student.txt"));
//		List<Student> list = (List<Student>) ois.readObject();
//		students = list;
//		ois.close();
//	}

	void cloneAndSort() {
		// 인터페이스는 클론 불가

		numSortedStudents = new ArrayList<Student>(students); // new 어레이리스트로 생성을 먼저 할 것
		nameSortedStudents = new ArrayList<Student>(students);
		totalSortedStudents = new ArrayList<Student>(students);
		// 람다가 가지는 컴퍼레이터는 요소가 두개
		numSortedStudents.sort((o1, o2) -> o2.getNo() - o1.getNo());
//		nameSortedStudents.sort((o1, o2)->o1.getName().hashCode() - o2.getName().hashCode());
		nameSortedStudents.sort(new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		Comparator<Student> comp = new MyComp();
//		totalSortedStudents.sort((o1, o2)->o2.total()-o1.total());
		totalSortedStudents.sort(comp);
		
		// 저장 기능 호출
		studentSave();
	}

	// 비교자 추가로 익명 클래스가 아닌 따로 클래스를 작성하기
	class MyComp implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o2.total() - o1.total();
		}
	}

	public void add() throws FileNotFoundException, IOException {
		int no = next("학번", Integer.class, t -> findBy(t) == null, "입력한 학번은 이미 존재합니다.");
		String name = next("이름", String.class, str -> str.matches("^[가-힣]{2,4}"), "2~4글자의 한글로 구성된 이름을 입력하십시오");
		int kor = next("국어", Integer.class, t -> t >= 0 && t <= 100, "0~100 사이의 숫자 입력");
		int eng = next("영어", Integer.class, t -> t >= 0 && t <= 100, "0~100 사이의 숫자 입력");
		int mat = next("수학", Integer.class, t -> t >= 0 && t <= 100, "0~100 사이의 숫자 입력");
		students.add(new Student(no, name, kor, eng, mat));
		System.out.println(students);
	}

	public void list() throws FileNotFoundException, IOException, ClassNotFoundException {
		int input = (next("1. 입력순  2. 학번순  3. 이름순  4. 석차순", Integer.class, t -> t > 0 && t < 5, "정확한 카테고리 입력"));
		System.out.println(input);
		List<Student> tmp = null;
		switch (input) {
			case 1:
				tmp = students;
				break;
			case 2:
				tmp = numSortedStudents;
				break;
			case 3:
				tmp = nameSortedStudents;
				break;
			case 4:
				tmp = totalSortedStudents;
				break;
			default:
				break;
		}
		System.out.println("학번    이름    국어    영어    수학    총점    평균");
		System.out.println("====================================================");
		tmp.forEach(System.out::println);
		System.out.println("====================================================");
	}

	public void modify() throws FileNotFoundException, IOException {
		Student s = findBy(next("학번", Integer.class, t -> t > 0, "학번은 0보다 작을 수 없습니다"));
		System.out.println(s);
		int kor = next("국어", Integer.class, t -> t >= 0 && t <= 100, "1~100 사이의 숫자 입력");
		int eng = next("영어", Integer.class, t -> t >= 0 && t <= 100, "1~100 사이의 숫자 입력");
		int mat = next("수학", Integer.class, t -> t >= 0 && t <= 100, "1~100 사이의 숫자 입력");
		String name = next("이름", String.class, str -> str.matches("^[가-힣]{2,4}"), "2~4글자의 한글로 구성된 이름을 입력하십시오");
		s.setName(name);
		s.setKor(kor);
		s.setEng(eng);
		s.setMat(mat);
	}

	public void remove() throws FileNotFoundException, IOException, ClassNotFoundException {
		Student s = findBy(next("학번", Integer.class, t -> t > 0, "학번은 0보다 작을 수 없습니다"));
		students.remove(s);
	}

	private Student findBy(int no) {
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getNo() == no) {
				student = students.get(i);
			}
		}
		return student;
	}
}
