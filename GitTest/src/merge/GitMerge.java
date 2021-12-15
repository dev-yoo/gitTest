package merge;

import inter.GitService;

public class GitMerge implements GitService{

	@Override
	public void wirte(String contents) {
		System.out.println(contents);
		
	}

	public void read() {
		System.out.println("테스트 입니다.");
	}
}
