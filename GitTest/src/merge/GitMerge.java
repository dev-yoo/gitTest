package merge;

import inter.GitService;

public class GitMerge implements GitService{

	@Override
	public void wirte(String contents) {
		System.out.println(contents);
		
	}

	public void read() {
		System.out.println("�׽�Ʈ �Դϴ�.");
	}
	
	public void listen() {
		System.out.println("����Դϴ�.");
	}

	@Override
	public int calurate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String contents() {
		System.out.println("������ ä�����ϴ�.");
		return null;
	}
}
