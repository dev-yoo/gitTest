package pull;

import inter.GitService;

public class GitPull implements GitService{

	@Override
	public void wirte(String contents) {
		System.out.println(contents);
	}

	@Override
	public int calurate() {
		// TODO Auto-generated method stub
		return 0;
	}

}
