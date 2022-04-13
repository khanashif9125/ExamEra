import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import baseUrl from 'src/app/services/helper';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {
  experts: any[] = [];

  datasource!: any[];
  issues: any[] = [];

  columnsToDisplay = [
    'resultId',
    'attempted',
    'category',
    'marksScored',
    'username'
  ];
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.getIssues().subscribe((data) => {
      
      this.issues = data;
      console.log(data);
      this.datasource = this.issues;
    });
  }
  getIssues():Observable<any>{
    return this.http.get<any>(
      `${baseUrl}/result/all`
    );
  }

}
