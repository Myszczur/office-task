import {Component, OnInit} from '@angular/core';
import {Guide} from "../guide";
import {GuideService} from "../guide.service";
import {logMessages} from "@angular-devkit/build-angular/src/builders/browser-esbuild/esbuild";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-guide',
  templateUrl: './create-guide.component.html',
  styleUrls: ['./create-guide.component.css']
})
export class CreateGuideComponent implements OnInit {

  guide: Guide = new Guide();

  constructor(private guideService: GuideService,
              private router: Router) {
  }

  ngOnInit(): void {
  }

  saveGuide() {
    this.guideService.createGuide(this.guide).subscribe(data => {
        console.log(data);
        this.goToGuideList();
      },
      error => console.log(error));
  }

  goToGuideList(){
    this.router.navigate(['/guide']);
  }

  onSubmit() {
    this.saveGuide();
  }
}
